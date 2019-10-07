package resume.service;

import resume.entity.Profile;

public interface SocialService<T> {

	Profile loginViaSocialNetwork(T model);
}
