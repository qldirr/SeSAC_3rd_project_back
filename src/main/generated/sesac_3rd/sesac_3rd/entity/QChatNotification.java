package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChatNotification is a Querydsl query type for ChatNotification
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChatNotification extends EntityPathBase<ChatNotification> {

    private static final long serialVersionUID = -243493148L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChatNotification chatNotification = new QChatNotification("chatNotification");

    public final NumberPath<Long> chatnotiId = createNumber("chatnotiId", Long.class);

    public final QChatRoom chatRoom;

    public final NumberPath<Integer> unreadCount = createNumber("unreadCount", Integer.class);

    public final QUser user;

    public QChatNotification(String variable) {
        this(ChatNotification.class, forVariable(variable), INITS);
    }

    public QChatNotification(Path<? extends ChatNotification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChatNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChatNotification(PathMetadata metadata, PathInits inits) {
        this(ChatNotification.class, metadata, inits);
    }

    public QChatNotification(Class<? extends ChatNotification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chatRoom = inits.isInitialized("chatRoom") ? new QChatRoom(forProperty("chatRoom"), inits.get("chatRoom")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

