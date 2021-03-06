package edu.odu.hackathon.plato.chatlist;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import edu.odu.hackathon.plato.R;

/**
 * Created by kahmed on 2/4/16.
 */
public class ChatListActivity extends Activity {

    String TAG = "ChatListActivity";
    ListView mListView;
    CustomChatListAdapter mAdapter;
    ArrayList<String> values;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "Started");
        setContentView(R.layout.activity_chat_list);
        mListView = (ListView) findViewById(R.id.lvChatList);

        values = new ArrayList<>(Arrays.asList("Masroor", "Avinash", "Girish",
                "Bharat", "Raghav", "Kumar", "Alex"));
        mAdapter = new CustomChatListAdapter(this, values);
        mListView.setAdapter(mAdapter);
        mListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        mListView.setItemsCanFocus(true);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
