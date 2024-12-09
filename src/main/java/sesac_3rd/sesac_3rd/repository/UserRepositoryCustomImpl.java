package sesac_3rd.sesac_3rd.repository;


import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.NumberExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sesac_3rd.sesac_3rd.dto.manager.StatisticsDTO;
import sesac_3rd.sesac_3rd.entity.QUser;

import static sesac_3rd.sesac_3rd.entity.QUser.user;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepositoryCustomImpl {
    private final JPAQueryFactory queryFactory;

    // 월별 & 일별 사용자 가입 수
    public List<StatisticsDTO> getUserStatistics(int year, Integer month, String period){
        NumberExpression<Integer> timeUnit = period.equals("month") ? user.createdAt.month() : user.createdAt.dayOfMonth();

        return queryFactory
                .select(Projections.constructor(StatisticsDTO.class,
                        timeUnit,
                        user.count()))
                .from(user)
                .where(
                        user.isDeleted.eq(false),
                        user.createdAt.year().eq(year),
                        monthEq(user, month),
                        user.createdAt.loe(LocalDateTime.now())
                )
                .groupBy(timeUnit)
                .orderBy(timeUnit.asc())
                .fetch();
    }

    private BooleanExpression monthEq(QUser user, Integer month){
        return month != null ? user.createdAt.month().eq(month) : null;
    }
}
