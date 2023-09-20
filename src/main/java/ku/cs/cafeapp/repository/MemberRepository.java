/*
 * Matupol 6310450638
 */

package ku.cs.cafeapp.repository;

import ku.cs.cafeapp.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {

    /*
     * This is an equivalent of
     * SELECT * FROM Member WHERE username = 'username'
     */
    Member findByUsername(String username);
}
