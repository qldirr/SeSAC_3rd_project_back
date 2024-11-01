package sesac_3rd.sesac_3rd.mapper.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sesac_3rd.sesac_3rd.dto.review.ReviewDTO;
import sesac_3rd.sesac_3rd.dto.review.ReviewFormDTO;
import sesac_3rd.sesac_3rd.entity.*;
import sesac_3rd.sesac_3rd.exception.CustomException;
import sesac_3rd.sesac_3rd.exception.ExceptionStatus;
import sesac_3rd.sesac_3rd.repository.PlaceRepository;
import sesac_3rd.sesac_3rd.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class ReviewMapper {

    @Autowired
    private PlaceRepository placeRepository;

    @Autowired
    private UserRepository userRepository;

    // dto to entity - 생성, 수정
    public Review convertToEntity(ReviewFormDTO dto, User user) {
        Place place = placeRepository.findByPlaceId(dto.getPlaceId());
        if (place == null) {
            throw new CustomException(ExceptionStatus.PLACEID_NOT_FOUND);
        }
        User getUserId = userRepository.findByUserId(dto.getUserId());
        if(getUserId == null){
            throw new CustomException(ExceptionStatus.USER_NOT_FOUND);
        }
        Review review = new Review();
        review.setPlace(place);
        review.setStar(dto.getStar());
        review.setUser(getUserId);
        review.setReviewContent(dto.getReviewContent());

        return review;
    }

    // entity to dto - 조회
    public static ReviewDTO convertToDTO(Review review) {
        return ReviewDTO.builder()
                .reviewId(review.getReviewId())
                .place(review.getPlace())
                .user(review.getUser())
                .reviewContent(review.getReviewContent())
                .isDeleted(review.isDeleted())
                .build();
    }
}
