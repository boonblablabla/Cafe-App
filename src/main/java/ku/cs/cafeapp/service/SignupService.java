/*
 * Matupol 6310450638
 */

package ku.cs.cafeapp.service;

import ku.cs.cafeapp.entity.Member;
import ku.cs.cafeapp.model.SignUpRequest;
import ku.cs.cafeapp.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired private MemberRepository memberRepository;
    @Autowired private PasswordEncoder passwordEncoder;
    @Autowired private ModelMapper modelMapper;

    public boolean isUsernameAvailable(String username) {
        return memberRepository.findByUsername(username) == null;
    }

    public void createUser(SignUpRequest user) {
        Member record = modelMapper.map(user, Member.class);
        record.setRole("ROLE_USER");

        String hashPassword = passwordEncoder.encode(user.getPassword());
        record.setPassword(hashPassword);

        memberRepository.save(record);
    }

    public Member getUser(String username) {
        return memberRepository.findByUsername(username);
    }
}
