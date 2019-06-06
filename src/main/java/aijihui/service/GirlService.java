package aijihui.service;

import aijihui.Girl;
import aijihui.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by maozhijian on 18/10/11.
 */

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional()
    public List<Girl> insertTwoGirls() {
        Girl a = new Girl();
        a.setAge(20);
        a.setCupSize("G");
        girlRepository.save(a);

        Girl c = girlRepository.getOne(10000000);
        c.setAge(30);
        girlRepository.save(c);

        Girl b = new Girl();
        b.setAge(20);
        b.setCupSize("E");
        girlRepository.save(b);


        List<Girl> rt = new ArrayList<Girl>();
        rt.add(a);
        rt.add(b);
        return  rt;
    }
}
