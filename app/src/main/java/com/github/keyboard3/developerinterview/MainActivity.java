package com.github.keyboard3.developerinterview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.github.keyboard3.developerinterview.adapter.SubjectAdapter;
import com.github.keyboard3.developerinterview.entity.Subject;

import java.util.ArrayList;
import java.util.List;

import scut.carson_ho.searchview.ICallBack;
import scut.carson_ho.searchview.SearchView;
import scut.carson_ho.searchview.bCallBack;

/**
 * 容器页面  包含左侧导航和右侧内容
 *
 * @author
 */
public class MainActivity extends AppCompatActivity {
    private List<Subject> subjectList=new ArrayList<>();
    private SearchView searchView;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_classification);
        initSearchView();
        initSubjects();
        RecyclerView subjectRecycleView = (RecyclerView)findViewById(R.id.subject_recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        subjectRecycleView.setLayoutManager(layoutManager);
        SubjectAdapter adapter=new SubjectAdapter(subjectList,MainActivity.this);
        subjectRecycleView.setAdapter(adapter);

    }

    private void initSearchView(){
        searchView = (SearchView) findViewById(R.id.search_view);

        // 4. 设置点击键盘上的搜索按键后的操作（通过回调接口）
        // 参数 = 搜索框输入的内容
        searchView.setOnClickSearch(new ICallBack() {
            @Override
            public void SearchAciton(String string) {
                //System.out.println("我收到了" + string);
                Intent newInent = new Intent(MainActivity.this,ProblemActivity.class);
                newInent.putExtra("searchKeyWord",string);
                startActivity(newInent);
            }
        });

        // 5. 设置点击返回按键后的操作（通过回调接口）
        searchView.setOnClickBack(new bCallBack() {
            @Override
            public void BackAciton() {
                finish();
            }
        });
    }
    private void initSubjects(){
        Subject machineLearning=new Subject("Machine Learning",R.mipmap.machine_learning_pic);
        subjectList.add(machineLearning);
        Subject deepLearning=new Subject("Deep Learning",R.mipmap.deep_learning_pic);
        subjectList.add(deepLearning);
        Subject reinforcementLearning = new Subject("Reinforcement Learning",R.mipmap.reinforcement_learning);
        subjectList.add(reinforcementLearning);
        Subject recommendationAlgorithm=new Subject("Recommendation Algorithm",R.mipmap.recom_alg);
        subjectList.add(recommendationAlgorithm);
        Subject computerVision= new Subject("Computer Vision",R.mipmap.computer_vision);
        subjectList.add(computerVision);
        Subject nlp=new Subject("NLP",R.mipmap.nlp);
        subjectList.add(nlp);
        Subject matrxiTheory=new Subject("Matrix Theory",R.mipmap.matrix_theory);
        subjectList.add(matrxiTheory);
        Subject java = new Subject("Java",R.mipmap.probability_theory);
        subjectList.add(java);
    }

}
