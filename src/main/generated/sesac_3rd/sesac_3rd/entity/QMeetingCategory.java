package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMeetingCategory is a Querydsl query type for MeetingCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMeetingCategory extends EntityPathBase<MeetingCategory> {

    private static final long serialVersionUID = 1012187576L;

    public static final QMeetingCategory meetingCategory = new QMeetingCategory("meetingCategory");

    public final NumberPath<Long> meetingCtgId = createNumber("meetingCtgId", Long.class);

    public final StringPath meetingCtgName = createString("meetingCtgName");

    public QMeetingCategory(String variable) {
        super(MeetingCategory.class, forVariable(variable));
    }

    public QMeetingCategory(Path<? extends MeetingCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMeetingCategory(PathMetadata metadata) {
        super(MeetingCategory.class, metadata);
    }

}

