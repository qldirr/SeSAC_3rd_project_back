package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReportReason is a Querydsl query type for ReportReason
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReportReason extends EntityPathBase<ReportReason> {

    private static final long serialVersionUID = 364703641L;

    public static final QReportReason reportReason = new QReportReason("reportReason");

    public final NumberPath<Long> reportRsId = createNumber("reportRsId", Long.class);

    public final StringPath reportRsName = createString("reportRsName");

    public QReportReason(String variable) {
        super(ReportReason.class, forVariable(variable));
    }

    public QReportReason(Path<? extends ReportReason> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReportReason(PathMetadata metadata) {
        super(ReportReason.class, metadata);
    }

}

