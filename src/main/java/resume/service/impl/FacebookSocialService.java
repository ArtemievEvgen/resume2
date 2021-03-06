package resume.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfb.types.User;

import resume.entity.Profile;
import resume.repository.storage.ProfileRepository;
import resume.service.SocialService;

@Service
public class FacebookSocialService implements SocialService<User> {

	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public Profile loginViaSocialNetwork(User model) {
		if(StringUtils.isNotBlank(model.getEmail())) {
			Profile p = profileRepository.findByEmail(model.getEmail());
			if(p != null){
				return p;
			}
		}
		//TODO Signup required here
		return null;
	}

}
