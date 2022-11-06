package com.example.todolist;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {
    protected Fragment createFragment(){
        UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }
}
