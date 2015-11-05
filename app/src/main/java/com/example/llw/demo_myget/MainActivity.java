package com.example.llw.demo_myget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ListView listview;
    public  set_string set_string1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview);
        MybaseAdapter mybaseAdapter = new MybaseAdapter(Myladgaga());
        listview.setAdapter(mybaseAdapter);
    }




    public class MybaseAdapter extends BaseAdapter {
        List<set_string> mylad;
        public MybaseAdapter(List<set_string> myladgaga) {
            this.mylad = myladgaga;
        }

        @Override
        public int getCount() {
            return mylad.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            set_string1 = mylad.get(position);
            LayoutInflater inflater = getLayoutInflater();
            convertView = inflater.inflate(R.layout.layout, null);
            if (viewHolder==null)
            {
                viewHolder = new ViewHolder();
                viewHolder.textView = (TextView) convertView.findViewById(R.id.text);
                viewHolder.content = (TextView) convertView.findViewById(R.id.button);
                viewHolder.textView.setText(set_string1.getSet_string_text());
                viewHolder.content.setText(set_string1.getSet_string_content());
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            return convertView;
        }
    }

    public class ViewHolder {
        TextView textView;
        TextView content;
    }

    public List<set_string> Myladgaga() {
        List<set_string> list = new ArrayList<set_string>();
        for (int i = 0; i < 20; i++) {
            set_string po = new set_string();
            po.setSet_string_text("水电煤");
            po.setSet_string_content("18.00元");
            list.add(po);
        }
        return list;
    }
}
