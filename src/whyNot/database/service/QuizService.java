package whyNot.database.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import whyNot.database.repository.QuizRep;
import whyNot.database.vo.QBank;

@Service
public class QuizService {
	@Autowired(required=false)
	private QuizRep dao;
	
	public ArrayList<QBank> qList002(QBank sch){
		return dao.qList02(sch);
	}
	
}
