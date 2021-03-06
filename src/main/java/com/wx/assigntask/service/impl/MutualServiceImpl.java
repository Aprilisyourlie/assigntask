package com.wx.assigntask.service.impl;

import com.wx.assigntask.comment.ItemList;
import com.wx.assigntask.dao.*;
import com.wx.assigntask.entity.*;
import com.wx.assigntask.service.IMutualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MutualServiceImpl implements IMutualService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    SubtaskCnnTfidfMapper subtaskCnnTfidfMapper;
    @Autowired
    ScoreCnnTfidfMapper scoreCnnTfidfMapper;
    @Autowired
    SubtaskDocIndexMapper subtaskDocIndexMapper;
    @Autowired
    ScoreDocIndexMapper scoreDocIndexMapper;
    @Autowired
    SubtaskLstmNnMapper subtaskLstmNnMapper;
    @Autowired
    ScoreLstmNnMapper scoreLstmNnMapper;
    @Autowired
    TaskNumMapper taskNumMapper;
    @Autowired
    AlgresultMapper algresultMapper;

    private int cnn_tfidf_count = 0;
    private int doc_index_count = 0;
    private int lstm_nn_count = 0;
    @Override
    public List<ItemList> cnn_tfidf_assignTask(User user) {
        TaskNum taskNum = taskNumMapper.selectById(1);
        int frequency = taskNum.getFrequence();
        cnn_tfidf_count = taskNum.getCurrent_num();
        System.out.println("taskNum.getFrequence()"+frequency);
        if (cnn_tfidf_count == 10000&&frequency == 3){
            return null;
        }else {
            List<ItemList> list = new ArrayList<>();
            System.out.println("-----------cnn_tfidf_count------------");
            System.out.println(cnn_tfidf_count);
            if (cnn_tfidf_count == 10000&&frequency != 3) {
                cnn_tfidf_count = 0;
            }
//        生成任务，将用户id写入任务数据表表
            int uid = user.getUser_id();
            for (int i = 0; i < 10; i++) {
                ItemList itemList = new ItemList();
                cnn_tfidf_count++;
                SubtaskCnnTfidf subtaskCnnTfidf = subtaskCnnTfidfMapper.selectByPrimaryKey(cnn_tfidf_count);
                //            uid表示任务分配给了谁
                subtaskCnnTfidf.setDividedId(uid);
//            更新重复次数
                frequency = subtaskCnnTfidf.getFrequency();
                if (frequency<3){frequency++;}
                System.out.println("frequency:"+frequency);
//            将分配的任务id写入用户数据表
                if (i == 0) {

                    user.setReceived_id(cnn_tfidf_count);
                    user.setAlgo_id(1);
                    user.setFrequency(frequency);
                    userMapper.updateUser(user);
                }

                subtaskCnnTfidf.setFrequency(frequency);
                System.out.println("setfrequency:" + frequency);
                subtaskCnnTfidfMapper.updateByPrimaryKey(subtaskCnnTfidf);
                itemList.setId(subtaskCnnTfidf.getSubtaskId());
                itemList.setInputname(subtaskCnnTfidf.getInputName());
                itemList.setInputdes(subtaskCnnTfidf.getInputDes());
                itemList.setItema(subtaskCnnTfidf.getItemName1());
                itemList.setDesa(subtaskCnnTfidf.getItemDes1());
                itemList.setItemb(subtaskCnnTfidf.getItemName2());
                itemList.setDesb(subtaskCnnTfidf.getItemDes2());
                list.add(itemList);

            }
            taskNum.setCurrent_num(cnn_tfidf_count);
            taskNum.setFrequence(frequency);
            taskNumMapper.update(taskNum);
            return list;
        }
    }

    @Override
    public List<ItemList> doc_index_assignTask(User user) {
        TaskNum taskNum = taskNumMapper.selectById(2);
        int frequency = taskNum.getFrequence();
        doc_index_count = taskNum.getCurrent_num();

        if (doc_index_count == 10000&&frequency == 3){
            return null;
        }else {
            List<ItemList> list = new ArrayList<>();
            System.out.println("-----------doc_index_count------------");
            System.out.println(doc_index_count);
            if (doc_index_count == 10000&& frequency != 3) {
                doc_index_count = 0;
            }
//        生成任务，将用户id写入任务数据表表
            int uid = user.getUser_id();
            for (int i = 0; i < 10; i++) {
                ItemList itemList = new ItemList();
                doc_index_count++;
                SubtaskDocIndex subtaskDocIndex = subtaskDocIndexMapper.selectByPrimaryKey(doc_index_count);
//            id表示任务分配给了谁
                subtaskDocIndex.setDividedId(uid);
                //            更新重复次数
                frequency = subtaskDocIndex.getFrequency();
                if (frequency<3){frequency++;}
                //            将分配的任务id写入用户数据表
                if (i == 0) {
                    user.setReceived_id(doc_index_count);
                    user.setAlgo_id(2);
                    user.setFrequency(frequency);
                    userMapper.updateUser(user);
                }

                subtaskDocIndex.setFrequency(frequency);
                subtaskDocIndexMapper.updateByPrimaryKey(subtaskDocIndex);
                itemList.setId(subtaskDocIndex.getSubtaskId());
                itemList.setInputname(subtaskDocIndex.getInputName());
                itemList.setInputdes(subtaskDocIndex.getInputDes());
                itemList.setItema(subtaskDocIndex.getItemName1());
                itemList.setDesa(subtaskDocIndex.getItemDes1());
                itemList.setItemb(subtaskDocIndex.getItemName2());
                itemList.setDesb(subtaskDocIndex.getItemDes2());
                list.add(itemList);

            }
            taskNum.setCurrent_num(doc_index_count);
            taskNum.setFrequence(frequency);
            taskNumMapper.update(taskNum);
            return list;
        }
    }

    @Override
    public List<ItemList> lstm_nn_assignTask(User user) {
        TaskNum taskNum = taskNumMapper.selectById(3);
        int frequency = taskNum.getFrequence();
        lstm_nn_count = taskNum.getCurrent_num();
        if (lstm_nn_count == 10000&&frequency == 3){
            return null;
        }else {
            List<ItemList> list = new ArrayList<>();
            System.out.println("-----------lstm_nn_count------------");
            System.out.println(lstm_nn_count);
            if (lstm_nn_count == 10000&&frequency != 3) {
                lstm_nn_count = 0;
            }
//        生成任务，将用户id写入任务数据表表
            int uid = user.getUser_id();
            for (int i = 0; i < 10; i++) {
                ItemList itemList = new ItemList();
                lstm_nn_count++;
                SubtaskLstmNn subtaskLstmNn = subtaskLstmNnMapper.selectByPrimaryKey(lstm_nn_count);
//            id表示任务分配给了谁
                subtaskLstmNn.setDividedId(uid);
                //            更新重复次数
                frequency = subtaskLstmNn.getFrequency();
                if (frequency<3){frequency++;}
//            将分配的任务id写入用户数据表
                if (i == 0) {
                    user.setReceived_id(lstm_nn_count);
                    user.setAlgo_id(3);
                    user.setFrequency(frequency);
                    userMapper.updateUser(user);
                }

                subtaskLstmNn.setFrequency(frequency);
                subtaskLstmNnMapper.updateByPrimaryKey(subtaskLstmNn);
                itemList.setId(subtaskLstmNn.getSubtaskId());
                itemList.setInputname(subtaskLstmNn.getInputName());
                itemList.setInputdes(subtaskLstmNn.getInputDes());
                itemList.setItema(subtaskLstmNn.getItemName1());
                itemList.setDesa(subtaskLstmNn.getItemDes1());
                itemList.setItemb(subtaskLstmNn.getItemName2());
                itemList.setDesb(subtaskLstmNn.getItemDes2());
                list.add(itemList);
            }
            taskNum.setCurrent_num(lstm_nn_count);
            taskNum.setFrequence(frequency);
            taskNumMapper.update(taskNum);
            return list;
        }
    }

    @Override
    public void cnn_tfidf_StoreData(User user, List<ItemList> lists) {
        int total = user.getTotal();
        int uid = user.getUser_id();
        int received_id = user.getReceived_id();
        int frequency = user.getFrequency();
        for(int i = 0;i<10;i++){
            if(i != 0){
                received_id++;
            }
            ScoreCnnTfidf scoreCnnTfidf = new ScoreCnnTfidf();
            scoreCnnTfidf.setScoreId(received_id);
            scoreCnnTfidf.setSubtaskId(received_id);
            if(scoreCnnTfidfMapper.selectByPrimaryKey(received_id) == null){
                scoreCnnTfidfMapper.insert(scoreCnnTfidf);
            }else {
                scoreCnnTfidf = scoreCnnTfidfMapper.selectByPrimaryKey(received_id);
            }
            switch (frequency){
                case 1:
                    scoreCnnTfidf.setUid1(uid);
                    scoreCnnTfidf.setScorea1(lists.get(i).getScorea());
                    scoreCnnTfidf.setScoreb1(lists.get(i).getScoreb());
                    break;
                case 2:
                    scoreCnnTfidf.setUid2(uid);
                    scoreCnnTfidf.setScorea2(lists.get(i).getScorea());
                    scoreCnnTfidf.setScoreb2(lists.get(i).getScoreb());
                    break;
                case 3:
                    scoreCnnTfidf.setUid3(uid);
                    scoreCnnTfidf.setScorea3(lists.get(i).getScorea());
                    scoreCnnTfidf.setScoreb3(lists.get(i).getScoreb());
                    break;
            }
            scoreCnnTfidfMapper.updateByPrimaryKey(scoreCnnTfidf);
        }
        if(received_id == 10000 && frequency == 3){
            Algresult algresult = algresultMapper.selectByPrimaryKey(1);
            algresult.setIffinal("yes");
            algresultMapper.updateByPrimaryKey(algresult);
        }
        user.setReceived_id(0);
        user.setAlgo_id(0);
        user.setFrequency(0);
        total++;
        user.setTotal(total);
        userMapper.updateUser(user);
    }

    @Override
    public void doc_index_StoreData(User user, List<ItemList> lists){
        int total = user.getTotal();
        int uid = user.getUser_id();
        int received_id = user.getReceived_id();
        int frequency = user.getFrequency();
        for(int i = 0;i<10;i++){
            if(i != 0){
                received_id++;
            }
            ScoreDocIndex scoreDocIndex = new ScoreDocIndex();
            scoreDocIndex.setScoreId(received_id);
            scoreDocIndex.setSubtaskId(received_id);
            if(scoreDocIndexMapper.selectByPrimaryKey(received_id) == null){
                scoreDocIndexMapper.insert(scoreDocIndex);
            }else {
                scoreDocIndex = scoreDocIndexMapper.selectByPrimaryKey(received_id);
            }
            switch (frequency){
                case 1:
                    scoreDocIndex.setUid1(uid);
                    scoreDocIndex.setScorea1(lists.get(i).getScorea());
                    scoreDocIndex.setScoreb1(lists.get(i).getScoreb());
                    break;
                case 2:
                    scoreDocIndex.setUid2(uid);
                    scoreDocIndex.setScorea2(lists.get(i).getScorea());
                    scoreDocIndex.setScoreb2(lists.get(i).getScoreb());
                    break;
                case 3:
                    scoreDocIndex.setUid3(uid);
                    scoreDocIndex.setScorea3(lists.get(i).getScorea());
                    scoreDocIndex.setScoreb3(lists.get(i).getScoreb());
                    break;
            }
            scoreDocIndexMapper.updateByPrimaryKey(scoreDocIndex);
        }
        if(received_id == 10000 && frequency == 3){
            Algresult algresult = algresultMapper.selectByPrimaryKey(2);
            algresult.setIffinal("yes");
            algresultMapper.updateByPrimaryKey(algresult);
        }
        user.setReceived_id(0);
        user.setAlgo_id(0);
        user.setFrequency(0);
        total++;
        user.setTotal(total);
        userMapper.updateUser(user);
    }

    @Override
    public void lstm_nn_StoreData(User user, List<ItemList> lists) {
        int total = user.getTotal();
        int received_id = user.getReceived_id();
        int uid = user.getUser_id();
        int frequency = user.getFrequency();
        for(int i = 0;i<10;i++){
            if(i != 0){
                received_id++;
            }
            ScoreLstmNn scoreLstmNn = new ScoreLstmNn();
            scoreLstmNn.setScoreId(received_id);
            scoreLstmNn.setSubtaskId(received_id);
            if(scoreLstmNnMapper.selectByPrimaryKey(received_id) == null){
                scoreLstmNn.setScoreId(received_id);
                scoreLstmNn.setSubtaskId(received_id);
                scoreLstmNnMapper.insert(scoreLstmNn);
            }else {
                scoreLstmNn = scoreLstmNnMapper.selectByPrimaryKey(received_id);
            }
            switch (frequency){
                case 1:
                    scoreLstmNn.setUid1(uid);
                    scoreLstmNn.setScorea1(lists.get(i).getScorea());
                    scoreLstmNn.setScoreb1(lists.get(i).getScoreb());
                    break;
                case 2:
                    scoreLstmNn.setUid2(uid);
                    scoreLstmNn.setScorea2(lists.get(i).getScorea());
                    scoreLstmNn.setScoreb2(lists.get(i).getScoreb());
                    break;
                case 3:
                    scoreLstmNn.setUid3(uid);
                    scoreLstmNn.setScorea3(lists.get(i).getScorea());
                    scoreLstmNn.setScoreb3(lists.get(i).getScoreb());
                    break;
            }
            scoreLstmNnMapper.updateByPrimaryKey(scoreLstmNn);
        }
        if(received_id == 10000 && frequency == 3){
            Algresult algresult = algresultMapper.selectByPrimaryKey(3);
            algresult.setIffinal("yes");
            algresultMapper.updateByPrimaryKey(algresult);
        }
        user.setReceived_id(0);
        user.setAlgo_id(0);
        user.setFrequency(0);
        total++;
        user.setTotal(total);
        userMapper.updateUser(user);
    }


}
