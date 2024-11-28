package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReport is a Querydsl query type for Report
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReport extends EntityPathBase<Report> {

    private static final long serialVersionUID = 1513667829L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReport report = new QReport("report");

    public final QChatMessage chatMessage;

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final QMeeting meeting;

    public final QUser reported;

    public final QUser reporter;

    public final NumberPath<Long> reportId = createNumber("reportId", Long.class);

    public final StringPath reportMessageContent = createString("reportMessageContent");

    public final QReportReason reportReason;

    public final QReview review;

    public QReport(String variable) {
        this(Report.class, forVariable(variable), INITS);
    }

    public QReport(Path<? extends Report> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReport(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReport(PathMetadata metadata, PathInits inits) {
        this(Report.class, metadata, inits);
    }

    public QReport(Class<? extends Report> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatMessage = inits.isInitialized("chatMessage") ? new QChatMessage(forProperty("chatMessage"), inits.get("chatMessage")) : null;
        this.meeting = inits.isInitialized("meeting") ? new QMeeting(forProperty("meeting"), inits.get("meeting")) : null;
        this.reported = inits.isInitialized("reported") ? new QUser(forProperty("reported")) : null;
        this.reporter = inits.isInitialized("reporter") ? new QUser(forProperty("reporter")) : null;
        this.reportReason = inits.isInitialized("reportReason") ? new QReportReason(forProperty("reportReason")) : null;
        this.review = inits.isInitialized("review") ? new QReview(forProperty("review"), inits.get("review")) : null;
    }

}

