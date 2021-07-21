package org.techtown.priceofcafe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;
import org.techtown.priceofcafe.R;
import org.techtown.priceofcafe.Fragment1;
import org.techtown.priceofcafe.Fragment2;
import org.techtown.priceofcafe.Fragment3;
import org.techtown.priceofcafe.Fragment4;
import org.techtown.priceofcafe.Fragment5;
import org.techtown.priceofcafe.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;
    Fragment5 fragment5;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        fragment5 = new Fragment5();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("1000원대"));
        tabs.addTab(tabs.newTab().setText("2000원대"));
        tabs.addTab(tabs.newTab().setText("3000원대"));
        tabs.addTab(tabs.newTab().setText("4000원대"));
        tabs.addTab(tabs.newTab().setText("5000원대"));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int position = tab.getPosition();
                Log.d("MainActivity", "선택된 탭 : " + position);

                Fragment selected = null;
                if (position == 0) {
                    selected = fragment1;
                } else if (position == 1) {
                    selected = fragment2;
                } else if (position == 2) {
                    selected = fragment3;
                } else if (position == 3) {
                    selected = fragment4;
                } else if (position == 4) {
                    selected = fragment5;
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    public void onButton1Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1257230655?c=14384738.3189805,4284198.2916612,15,0,0,0,dh&placePath=%3Fentry=plt"));
        startActivity(myIntent); }
    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/vanbeek_official/"));
        startActivity(myIntent); }
    public void onButton3Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/twelvestoryceo/"));
        startActivity(myIntent); }
    public void onButton4Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%ED%95%98%EC%82%BC%EB%8F%99%EC%BB%A4%ED%94%BC%20%EA%B2%BD%EC%A3%BC%ED%98%91%EC%84%B1%ED%9C%B4%ED%8F%AC%EB%A0%88%EC%A0%90/place/1753624589?c=14384479.3119213,4284545.7719268,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton5Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%ED%95%91%EA%B1%B0%EC%BB%A4%ED%94%BC%20%EC%9A%A9%ED%99%A9%EC%A0%90/place/1218017521?c=14385256.5112102,4284886.2833997,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton6Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.angelinus.com/index.asp"));
        startActivity(myIntent); }
    public void onButton7Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("ttps://www.instagram.com/refou_cafe_/"));
        startActivity(myIntent); }
    public void onButton8Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafehill_gyeongju/"));
        startActivity(myIntent); }
    public void onButton9Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%98%A4%EB%A6%AC%EC%A7%84%EC%95%8C/place/1083897685?c=14384842.8479824,4284422.8864906,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton10Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%82%AC%EB%B8%8C%EB%A6%AC%EB%82%98/place/11859365?c=14384204.7980570,4281523.3082565,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton11Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%A9%94%EA%B0%80%EC%BB%A4%ED%94%BC%20%EA%B2%BD%EC%A3%BC%EC%9A%A9%ED%99%A9%EC%A0%90/place/1980322280?c=14384561.4545736,4284561.2151411,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton12Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/vintagegarden.kyungju/"));
        startActivity(myIntent); }
    public void onButton13Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://theventi.co.kr/new2020/main/main.html"));
        startActivity(myIntent); }
    public void onButton14Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafe.adansonii/?igshid=txpsgbjl2mw0"));
        startActivity(myIntent); }
    public void onButton15Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%B0%B0%EC%8A%A4%ED%82%A8%EB%9D%BC%EB%B9%88%EC%8A%A4%20%EA%B2%BD%EC%A3%BC%EC%9A%A9%ED%99%A9%EC%A0%90/place/1073291946?c=14384546.4487062,4284557.7665211,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton16Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%8F%99%EA%B0%90%20coffee/place/1179023390?c=14384496.0432408,4284537.7755380,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton17Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%8B%A4%EB%B9%84%EB%93%9C%20%EC%BB%A4%ED%94%BC/place/996473250?c=14384310.7630803,4282440.1767010,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton18Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%B9%BD%EB%8B%A4%EB%B0%A9%20%EA%B2%BD%EC%A3%BC%EC%9A%A9%ED%99%A9%EC%A0%90/place/1742296790?c=14384475.2598918,4284544.5903295,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton19Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/viennacoffeehouse_yonghwangro/"));
        startActivity(myIntent); }
    public void onButton20Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/y_____sd/"));
        startActivity(myIntent); }
    public void onButton21Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thumbcoffee.co.kr/"));
        startActivity(myIntent); }
    public void onButton22Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafe_yeoyou/"));
        startActivity(myIntent); }
    public void onButton23Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ediya.coffee/"));
        startActivity(myIntent); }
    public void onButton24Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1442366692?c=14370331.9293434,4280858.4799505,10,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton25Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%B4%EB%94%94%EC%95%BC%EC%BB%A4%ED%94%BC%20%EA%B2%BD%EC%A3%BC%EC%9A%A9%EA%B0%95%EB%8F%99%EC%A0%90/place/1092811750?c=14356082.6894315,4283873.6423743,10,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton26Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://akongcafe.modoo.at/"));
        startActivity(myIntent); }
    public void onButton27Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/cafe_illago"));
        startActivity(myIntent); }
    public void onButton28Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%BB%A4%ED%94%BC%ED%94%8C%EB%A0%88%EC%9D%B4%EC%8A%A4%20%EB%8F%99%EC%B2%9C%EC%A0%90/place/36317490?c=14384225.6593296,4281382.8754674,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton29Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/9%EB%B2%88%EA%B0%80%EC%B9%B4%ED%8E%98/place/1226999672?c=14384734.2780830,4281775.2924059,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton30Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%B9%B4%ED%8E%98%EA%B8%B8/place/34079445?c=14384230.1900329,4281460.6736902,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton31Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%B9%B4%ED%8E%98%EB%B3%84%EB%A7%88%EB%A3%A8/place/1315219023?c=14384133.0637771,4281670.1987165,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton32Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%B4%EB%94%94%EC%95%BC%EC%BB%A4%ED%94%BC%20%EA%B2%BD%EC%A3%BC%ED%99%88%ED%94%8C%EB%9F%AC%EC%8A%A4%EC%A0%90/place/1146757763?c=14384313.1787133,4283221.0620342,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton33Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%B9%B4%ED%8E%98%EB%B4%84%EB%B4%84%20%EC%9A%A9%EA%B0%95%EC%A0%90/place/1392158633?c=14384650.5769579,4284667.9305489,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton34Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%BB%A4%ED%94%BC%EC%BD%A9%EB%B6%80%EC%9D%B8/place/1850519392?c=14385937.0851810,4282895.7550244,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton35Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9A%94%EA%B1%B0%ED%94%84%EB%A0%88%EC%86%8C%20%EA%B2%BD%EC%A3%BC%EC%9A%A9%EA%B0%95%EC%A0%90/place/1955316435?c=14384894.4890942,4283638.5352913,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton36Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%B2%A4%EC%9E%90%EB%A7%88%EC%8A%A4%EC%B9%B4%ED%8E%98/place/36826786?c=14385752.5953890,4279166.3953220,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton37Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/cafe_la.fleur"));
        startActivity(myIntent); }
    public void onButton38Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/cafe._.dongcheon"));
        startActivity(myIntent); }
    public void onButton39Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%ED%95%91%EA%B1%B0%EC%BB%A4%ED%94%BC%20%EB%8F%99%EC%B2%9C%EC%A0%90/place/1074204837?c=14384887.7653969,4281139.8145451,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton40Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/edgebrown_gyeongju"));
        startActivity(myIntent); }
    public void onButton41Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/1992_youth_fruit"));
        startActivity(myIntent); }
    public void onButton42Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafe_don9urami/"));
        startActivity(myIntent); }
    public void onButton43Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/cafe_heewol"));
        startActivity(myIntent); }
    public void onButton44Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/__soraroom__"));
        startActivity(myIntent); }
    public void onButton45Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%B4%EB%94%94%EC%95%BC%EC%BB%A4%ED%94%BC%20%EA%B2%BD%EC%A3%BC%EB%8F%99%EC%B2%9C%EB%8F%99%EC%A0%90/place/36254063?c=14384372.2893629,4281161.9145143,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton46Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%B9%B4%ED%8E%98%EB%93%9C%EB%A6%BD/place/38664396?c=14385444.7302052,4279273.2775865,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton47Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9A%94%EA%B1%B0%ED%94%84%EB%A0%88%EC%86%8C%20%EA%B2%BD%EC%A3%BC%EB%8F%99%EC%B2%9C%EC%A0%90/place/31317380?c=14384400.7871525,4281318.3324838,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton48Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%B4%EB%94%94%EC%95%BC%EC%BB%A4%ED%94%BC%20%EA%B2%BD%EC%A3%BC%EC%95%8C%EC%B2%9C%EC%A0%90/place/1893756394?c=14384946.4196366,4279940.3301118,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton49Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafe_daonlaon"));
        startActivity(myIntent); }
    public void onButton50Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%ED%8C%8C%EB%A6%AC%EB%B0%94%EA%B2%8C%EB%9C%A8%20%EA%B2%BD%EC%A3%BC%EC%8B%9C%EC%B2%AD%EC%A0%90/place/33284390?c=14384223.1212452,4280899.9592806,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton51Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%9A%9C%EB%A0%88%EC%A5%AC%EB%A5%B4%20%EA%B2%BD%EC%A3%BC%EB%8F%99%EC%B2%9C%EC%A0%90%20/place/11803750?c=14384217.7890416,4280927.5802069,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton52Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/503%EC%B9%B4%ED%8E%98/place/1726032776?c=14384392.6163019,4281140.0617788,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton53Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://coffeesong.modoo.at/"));
        startActivity(myIntent); }
    public void onButton54Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/cafe_gowoon"));
        startActivity(myIntent); }
    public void onButton55Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/cafe_maisondeu"));
        startActivity(myIntent); }
    public void onButton56Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%BB%A4%ED%94%BC%EC%B4%9D%EA%B0%81/place/36992384?c=14384785.7076878,4279591.8569517,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton57Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/soohyangjk"));
        startActivity(myIntent); }
    public void onButton58Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%81%8C%EB%A6%BC%EC%B9%B4%ED%8E%98%20&%20%EC%9D%B4%EC%88%98%EB%AA%85%EB%A6%AC%EC%9B%90/place/1379995748?c=14384560.1410036,4281034.9604856,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton59Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/starpalace_cafe"));
        startActivity(myIntent); }
    public void onButton60Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%89%B4%EB%B9%88%20%EB%8F%99%EC%B2%9C%EC%A0%90/place/1989464589?c=14384500.8522428,4280428.3266376,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton61Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%94%A8%EC%97%90%EB%A1%9C/place/1763350611?c=14385460.5821007,4279183.9045509,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton62Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%B4%EB%94%94%EC%95%BC%EC%BB%A4%ED%94%BC%20%EB%8F%99%EC%B2%9C%ED%98%84%EB%8C%80%EC%A0%90/place/1410444654?c=14384496.3326715,4280302.7957787,15,0,0,0,dh&placePath=%3Fentry%253Dbmp"));
        startActivity(myIntent); }
    public void onButton63Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%B9%B4%ED%8E%98%EB%8B%A4%EC%98%A8/place/1192294943?placePath=%3Fentry=pll%26from=nx%26fromNxList=true&c=14396390.6198876,4256682.4595147,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton64Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9A%94%EA%B1%B0%ED%94%84%EB%A0%88%EC%86%8C%20%EA%B2%BD%EC%A3%BC%EB%8F%99%EC%B2%9C%ED%83%80%EC%9A%B4%EC%A0%90/place/31841388?c=14385053.0080491,4279791.3342918,15,0,0,0,dh&placePath=%3Fentry%253Dpll"));
        startActivity(myIntent); }
    public void onButton65Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/laforet_1004"));
        startActivity(myIntent); }
    public void onButton66Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.naver.com/chj981"));
        startActivity(myIntent); }
    public void onButton67Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%B9%B4%ED%8E%98%EC%9D%B8%EB%8D%94%EB%AC%B8/place/1732952942?c=14384212.3009907,4280795.2448785,15,0,0,0,dh&placePath=%3Fentry%253Dpll"));
        startActivity(myIntent); }
    public void onButton68Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/PAGE/place/37021241?c=14383748.5217282,4280729.2907051,15,0,0,0,dh&placePath=%3Fentry%253Dpll"));
        startActivity(myIntent); }
    public void onButton69Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%B4%EB%AF%BC%EC%B2%A0%EC%BB%A4%ED%94%BC%EA%B3%B5%EB%B0%A9/place/1267365451?c=14385649.6916517,4279505.9832535,15,0,0,0,dh"));
        startActivity(myIntent); }
    public void onButton70Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%B9%B4%ED%8E%98%20%EB%B0%80%EB%A3%A8/place/1114790773?c=14384971.8561403,4279504.2940767,15,0,0,0,dh&placePath=%3Fentry%253Dpll"));
        startActivity(myIntent); }
    public void onButton71Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton72Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton73Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton74Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton75Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton76Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton77Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton78Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton79Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton80Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton81Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton82Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton83Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton84Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton85Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton86Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton87Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton88Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton89Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton90Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton91Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton92Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton93Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton94Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton95Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton96Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton97Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton98Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton99Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton100Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton101Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton102Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }
    public void onButton103Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(myIntent); }


}

