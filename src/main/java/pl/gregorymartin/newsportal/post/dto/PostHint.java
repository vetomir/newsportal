package pl.gregorymartin.newsportal.post.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pl.gregorymartin.newsportal.appUser.dto.AppUserReadModel;
import pl.gregorymartin.newsportal.category.dto.CategoryQueryReadModel;
import pl.gregorymartin.newsportal.comment.dto.CommentReadModel;
import pl.gregorymartin.newsportal.tag.dto.TagReadModel;

import java.util.List;

@Builder
@Getter
@Setter
public
class PostHint {
    private String title;
    private String categoryName;
}
