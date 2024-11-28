package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlace is a Querydsl query type for Place
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlace extends EntityPathBase<Place> {

    private static final long serialVersionUID = 324269350L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlace place = new QPlace("place");

    public final StringPath detailAddress = createString("detailAddress");

    public final StringPath homepageUrl = createString("homepageUrl");

    public final BooleanPath isPaid = createBoolean("isPaid");

    public final NumberPath<java.math.BigDecimal> latitude = createNumber("latitude", java.math.BigDecimal.class);

    public final StringPath location = createString("location");

    public final NumberPath<java.math.BigDecimal> longitude = createNumber("longitude", java.math.BigDecimal.class);

    public final StringPath operatingDate = createString("operatingDate");

    public final QPlaceCategory placeCategory;

    public final NumberPath<Long> placeId = createNumber("placeId", Long.class);

    public final StringPath placeImg = createString("placeImg");

    public final StringPath placeName = createString("placeName");

    public final StringPath placeNum = createString("placeNum");

    public QPlace(String variable) {
        this(Place.class, forVariable(variable), INITS);
    }

    public QPlace(Path<? extends Place> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlace(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlace(PathMetadata metadata, PathInits inits) {
        this(Place.class, metadata, inits);
    }

    public QPlace(Class<? extends Place> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.placeCategory = inits.isInitialized("placeCategory") ? new QPlaceCategory(forProperty("placeCategory")) : null;
    }

}

