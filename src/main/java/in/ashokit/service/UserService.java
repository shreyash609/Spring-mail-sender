package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.utils.EmailSender;

@Service
public class UserService {

	@Autowired
	private EmailSender sender;

	public boolean sendEmail(String email) {

		String subject="Email Check mail";
		String body="<h1>Thank You For Your Co-Operation</h1>";

		return sender.mailSender(subject, body, email);

	}
}
