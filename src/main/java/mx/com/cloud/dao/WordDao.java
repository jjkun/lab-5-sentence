package mx.com.cloud.dao;

import mx.com.cloud.domain.Word;

public interface WordDao {
	public static final String SUBJECT = "SUBJECT";
	public static final String VERB = "VERB";
	public static final String ARTICLE = "ARTICLE";
	public static final String ADJECTIVE = "ADJECTIVE";
	public static final String NOUN = "NOUN";
	public Word getWord();
}
