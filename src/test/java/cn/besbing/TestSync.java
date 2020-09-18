package cn.besbing;


import cn.besbing.Cron.AnalysisThread;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DloadercloudApplication.class)
public class TestSync {

    /*@Test
    public void testAnalysisThread() throws Exception {
        AnalysisThread analysisThread = new AnalysisThread();
        analysisThread.addTestListThread();
    }*/

    @Test
    public void testAnalysisThread() throws Exception {
        AnalysisThread analysisThread = new AnalysisThread();
        analysisThread.onlyAddAnalysisThread();
        analysisThread.addTestListThread();
        analysisThread.clearDuplicationData();
    }

}
