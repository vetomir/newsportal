package pl.gregorymartin.newsportal.tag;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.gregorymartin.newsportal.post.Post;

import java.util.List;
import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag, Long> {

    @Query("Select t From Tag t where t.name = ?1")
    Optional<Tag> findByName(String name);
    Optional<Tag> getByName(String name);
    Page<Tag> findAll(Pageable page);
}
