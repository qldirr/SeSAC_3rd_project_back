package sesac_3rd.sesac_3rd.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlaceCategory is a Querydsl query type for PlaceCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceCategory extends EntityPathBase<PlaceCategory> {

    private static final long serialVersionUID = -1751871420L;

    public static final QPlaceCategory placeCategory = new QPlaceCategory("placeCategory");

    public final NumberPath<Long> placeCtgId = createNumber("placeCtgId", Long.class);

    public final StringPath placeCtgName = createString("placeCtgName");

    public QPlaceCategory(String variable) {
        super(PlaceCategory.class, forVariable(variable));
    }

    public QPlaceCategory(Path<? extends PlaceCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlaceCategory(PathMetadata metadata) {
        super(PlaceCategory.class, metadata);
    }

}

