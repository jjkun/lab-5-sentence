package mx.com.cloud.dao;

import org.springframework.stereotype.Component;

@Component("adjectiveService")
public class AdjectiveDaoImpl extends WordDaoImpl {

	@Override
	public String getPartOfSpeech() {
		return ADJECTIVE;
	}

}
