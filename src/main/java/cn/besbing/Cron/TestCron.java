package cn.besbing.Cron;

import cn.besbing.Entities.Analysis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class TestCron {


    Logger logger = LoggerFactory.getLogger(TestCron.class);



    @Scheduled(cron = "0 0 0 * * ?")
    public void addAnalysis(){
        AnalysisThread analysisThread = new AnalysisThread();
        try {
            analysisThread.onlyAddAnalysisThread();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //logger.info("================sheny");

    }


    @Scheduled(cron = "0 0 1 * * ?")
    public void addTestList(){
        AnalysisThread analysisThread = new AnalysisThread();
        try {
            analysisThread.onlyAddAnalysisThread();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
