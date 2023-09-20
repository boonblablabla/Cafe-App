/*
 * Matupol 6310450638
 */

package ku.cs.cafeapp.model;

import lombok.Data;

@Data
public class SignUpRequest {
    private String name;
    private String username;
    private String password;
}
