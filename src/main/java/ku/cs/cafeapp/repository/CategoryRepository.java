/*
 * Matupol 6310450638
 */

package ku.cs.cafeapp.repository;

import ku.cs.cafeapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
