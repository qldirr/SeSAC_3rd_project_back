package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserMeeting is a Querydsl query type for UserMeeting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserMeeting extends EntityPathBase<UserMeeting> {

    private static final long serialVersionUID = -197430065L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserMeeting userMeeting = new QUserMeeting("userMeeting");

    public final DateTimePath<java.time.LocalDateTime> acceptedAt = createDateTime("acceptedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> blockedAt = createDateTime("blockedAt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> capacity = createNumber("capacity", Integer.class);

    public final BooleanPath isAccepted = createBoolean("isAccepted");

    public final BooleanPath isBlocked = createBoolean("isBlocked");

    public final BooleanPath isWithdraw = createBoolean("isWithdraw");

    public final QMeeting meeting;

    public final QUser user;

    public final NumberPath<Long> userMeetingId = createNumber("userMeetingId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> withdrawAt = createDateTime("withdrawAt", java.time.LocalDateTime.class);

    public QUserMeeting(String variable) {
        this(UserMeeting.class, forVariable(variable), INITS);
    }

    public QUserMeeting(Path<? extends UserMeeting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserMeeting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserMeeting(PathMetadata metadata, PathInits inits) {
        this(UserMeeting.class, metadata, inits);
    }

    public QUserMeeting(Class<? extends UserMeeting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.meeting = inits.isInitialized("meeting") ? new QMeeting(forProperty("meeting"), inits.get("meeting")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

