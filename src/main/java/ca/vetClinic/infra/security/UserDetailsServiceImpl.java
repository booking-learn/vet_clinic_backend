package ca.vetClinic.infra.security;

import ca.vetClinic.domain.repository.EmployeRepository;
import ca.vetClinic.domain.repository.UserRepository;
import ca.vetClinic.infra.mapper.EmployeMapper;
import ca.vetClinic.infra.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
	private final UserRepository userRepository;
	private final EmployeRepository employeRepository;
	private final UserMapper userMapper;
	private final EmployeMapper employeMapper;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		return employeRepository.findByEmail(email).map(UserPrincipal::fromEmployee)
				.or(() -> userRepository.findByEmail(email).map(UserPrincipal::fromUser))
				.orElseThrow(() -> new UsernameNotFoundException(email));
	}
}
