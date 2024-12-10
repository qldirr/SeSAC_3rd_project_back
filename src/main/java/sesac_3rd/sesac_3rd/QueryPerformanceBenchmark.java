package sesac_3rd.sesac_3rd;

import org.openjdk.jmh.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import sesac_3rd.sesac_3rd.dto.manager.MonthlyUserStatisticsDTO;
import sesac_3rd.sesac_3rd.dto.manager.StatisticsDTO;
import sesac_3rd.sesac_3rd.repository.UserRepository;
import sesac_3rd.sesac_3rd.repository.UserRepositoryCustomImpl;

import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 10, time = 1)
@Fork(2)
public class QueryPerformanceBenchmark {
    private ConfigurableApplicationContext context;
    private UserRepositoryCustomImpl userRepositoryCustom;
    private UserRepository userRepository;

//    @Autowired
//    UserRepositoryCustomImpl userRepositoryCustom;
//
//    @Autowired
//    UserRepository userRepository;

    @Setup(Level.Trial)
    public void setup() {
        // 수동으로 애플리케이션 컨텍스트 로드 방식 변경
        ApplicationContext context =
                SpringApplication.run(Sesac3rdApplication.class,
                        "--server.port=0");  // 랜덤 포트 사용

        userRepositoryCustom = context.getBean(UserRepositoryCustomImpl.class);
        userRepository = context.getBean(UserRepository.class);
    }

    @TearDown(Level.Trial)
    public void tearDown() {
        if (context != null) {
            context.close();
        }
    }

    @Benchmark
    public List<StatisticsDTO> benchmarkQuerydsl(){
        return userRepositoryCustom.getUserStatistics(2024, null, "month");
    }

    @Benchmark
    public List<MonthlyUserStatisticsDTO> benchmarkJPQL(){
        return userRepository.findMonthlyStatByYear(2024);
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
