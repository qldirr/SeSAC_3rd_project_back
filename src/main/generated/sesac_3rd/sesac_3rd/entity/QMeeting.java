package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMeeting is a Querydsl query type for Meeting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMeeting extends EntityPathBase<Meeting> {

    private static final long serialVersionUID = -473507174L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMeeting meeting = new QMeeting("meeting");

    public final NumberPath<Integer> capacity = createNumber("capacity", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath detailAddress = createString("detailAddress");

    public final StringPath district = createString("district");

    public final BooleanPath isAuthType = createBoolean("isAuthType");

    public final BooleanPath isLimited = createBoolean("isLimited");

    public final NumberPath<java.math.BigDecimal> latitude = createNumber("latitude", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> longitude = createNumber("longitude", java.math.BigDecimal.class);

    public final QMeetingCategory meetingCategory;

    public final StringPath meetingContent = createString("meetingContent");

    public final NumberPath<Long> meetingId = createNumber("meetingId", Long.class);

    public final StringPath meetingLocation = createString("meetingLocation");

    public final EnumPath<sesac_3rd.sesac_3rd.constant.MeetingStatus> meetingStatus = createEnum("meetingStatus", sesac_3rd.sesac_3rd.constant.MeetingStatus.class);

    public final DateTimePath<java.time.LocalDateTime> meetingTime = createDateTime("meetingTime", java.time.LocalDateTime.class);

    public final StringPath meetingTitle = createString("meetingTitle");

    public final QPlace place;

    public final NumberPath<Integer> totalCapacity = createNumber("totalCapacity", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final QUser user;

    public QMeeting(String variable) {
        this(Meeting.class, forVariable(variable), INITS);
    }

    public QMeeting(Path<? extends Meeting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMeeting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMeeting(PathMetadata metadata, PathInits inits) {
        this(Meeting.class, metadata, inits);
    }

    public QMeeting(Class<? extends Meeting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.meetingCategory = inits.isInitialized("meetingCategory") ? new QMeetingCategory(forProperty("meetingCategory")) : null;
        this.place = inits.isInitialized("place") ? new QPlace(forProperty("place"), inits.get("place")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

