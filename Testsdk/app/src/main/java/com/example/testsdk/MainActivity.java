package com.example.testsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int colaCnt, ciderCnt, fantaCnt, sodaCnt; // 음료 수량
    int uCola, uCider, uFanta, uSoda, colaPrice, ciderPrice, fantaPrice, sodaPrice; // 사용자가 구매한 음료 수량

    final String TAG = "체크";
    MoneyDTO money = new MoneyDTO();
    EditText edt_cash;
    Button btn_cash, btn_cola, btn_cider, btn_fanta, btn_soda, btn_change;

    TextView txt_cash, txt_cola, txt_colaCount, txt_cider, txt_ciderCount, txt_fanta, txt_fantaCount, txt_soda, txt_sodaCount;
    ArrayList<DrinkDTO> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edt_cash = findViewById(R.id.edt_cash);
        btn_cash = findViewById(R.id.btn_cash);
        txt_cash = findViewById(R.id.txt_cash);

        txt_cola = findViewById(R.id.txt_cola);
        txt_colaCount = findViewById(R.id.txt_colaCount);
        txt_cider = findViewById(R.id.txt_cider);
        txt_ciderCount = findViewById(R.id.txt_ciderCount);
        txt_fanta = findViewById(R.id.txt_fanta);
        txt_fantaCount = findViewById(R.id.txt_fantaCount);
        txt_soda = findViewById(R.id.txt_soda);
        txt_sodaCount = findViewById(R.id.txt_sodaCount);
        btn_cola = findViewById(R.id.btn_cola);
        btn_cider = findViewById(R.id.btn_cider);
        btn_fanta = findViewById(R.id.btn_fanta);
        btn_soda = findViewById(R.id.btn_soda);
        btn_change = findViewById(R.id.btn_change);

        btn_cash.setOnClickListener(this);
        btn_cash.setVisibility(btn_cash.VISIBLE);
        btn_cash.setEnabled(true);
        btn_cola.setOnClickListener(this);
        btn_cider.setOnClickListener(this);
        btn_fanta.setOnClickListener(this);
        btn_soda.setOnClickListener(this);
        btn_change.setOnClickListener(this);

        list.add(new DrinkDTO("콜라", 10, 800));
        list.add(new DrinkDTO("사이다", 10, 800));
        list.add(new DrinkDTO("환타", 8, 700));
        list.add(new DrinkDTO("데미소다", 8, 700));

        txt_cola.setText(list.get(0).getDrink() + list.get(0).getPrice() + "원");
//        txt_colaCount.setText(list.get(0).getCount() + "개");

        txt_cider.setText(list.get(1).getDrink() + list.get(1).getPrice() + "원");
//        txt_ciderCount.setText(list.get(1).getCount() + "개");

        txt_fanta.setText(list.get(2).getDrink() + list.get(2).getPrice() + "원");
//        txt_fantaCount.setText(list.get(2).getCount() + "개");

        txt_soda.setText(list.get(3).getDrink() + list.get(3).getPrice() + "원");
//        txt_sodaCount.setText(list.get(3).getCount() + "개");

        txt_cash.setText("잔액: " + money.getMoney() + "원");


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_cash) {
            try {
                money.setMoney(money.money+Integer.parseInt(edt_cash.getText().toString()));
                txt_cash.setText("잔액:" + money.getMoney() + "원");



            } catch (Exception e) {
                Toast.makeText(MainActivity.this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
            }

        }
//                 else {
//                    Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
//                }


        else if(v.getId()==R.id.btn_cola){
            if (list.get(0).getPrice() <= money.money) {
                        colaCnt = list.get(0).getCount();
                        uCola++;
                        if(colaCnt>0){
                        colaCnt--;
                        list.get(0).setCount(colaCnt);
                        }else{
                            Toast.makeText(MainActivity.this, "콜라의 남은 재고가 없습니다.", Toast.LENGTH_SHORT).show();
                        }
                        money.setMoney(money.getMoney() - ( list.get(0).getPrice()));
                        txt_cola.setText(list.get(0).getDrink() + list.get(0).getPrice() + "원");
                        txt_colaCount.setText(list.get(0).getCount() + "개");
                         txt_cash.setText("잔액: "+money.getMoney()+"원");


            } else{
                Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
            }
            }else if (v.getId() == R.id.btn_cider) {
            if(list.get(1).getPrice() <= money.money){
                ciderCnt = list.get(1).getCount();
                uCider++;
                if(ciderCnt>0){
                    ciderCnt--;
                    list.get(1).setCount(ciderCnt);
                }else{
                    Toast.makeText(MainActivity.this, "사이다의 남은 재고가 없습니다.", Toast.LENGTH_SHORT).show();
                }
                money.setMoney(money.getMoney() - ( list.get(1).getPrice()));
                txt_cider.setText(list.get(1).getDrink() + list.get(1).getPrice() + "원");
                txt_ciderCount.setText(list.get(1).getCount() + "개");
                txt_cash.setText("잔액: "+money.getMoney()+"원");
                Log.d("잔액", "onClick: " + money.getMoney());

            }else{
                Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
            }


             } else if (v.getId() == R.id.btn_fanta) {
                       if(list.get(2).getPrice() <= money.money){
                       fantaCnt = list.get(2).getCount();
                       uFanta++;
                       if(fantaCnt>0){
                    fantaCnt--;
                    list.get(2).setCount(fantaCnt);
                }else{
                    Toast.makeText(MainActivity.this, "환타의 남은 재고가 없습니다.", Toast.LENGTH_SHORT).show();
                }
                       money.setMoney(money.getMoney() - ( list.get(2).getPrice()));
                       txt_fanta.setText(list.get(2).getDrink() + list.get(2).getPrice() + "원");
                       txt_fantaCount.setText(list.get(2).getCount() + "개");
                       txt_cash.setText("잔액: "+money.getMoney()+"원");
            }else{
                Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.btn_soda) {
            if(list.get(3).getPrice() <= money.money){
                sodaCnt = list.get(3).getCount();
                uSoda++;
                if(sodaCnt>0){
                    sodaCnt--;
                    list.get(3).setCount(sodaCnt);
                }else{
                    Toast.makeText(MainActivity.this, "데미소다의 남은 재고가 부족합니다.", Toast.LENGTH_SHORT).show();
                }
                money.setMoney(money.getMoney() - ( list.get(3).getPrice()));
                txt_soda.setText(list.get(3).getDrink() + list.get(3).getPrice() + "원");
                txt_sodaCount.setText(list.get(3).getCount() + "개");
                txt_cash.setText("잔액: "+money.getMoney()+"원");
            }else{
                Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
            }

        }else if(v.getId() == R.id.btn_change){
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("change", money.money);
            intent.putExtra("list", list);
            intent.putExtra("uCola", uCola);
            intent.putExtra("uCider", uCider);
            intent.putExtra("uFanta", uFanta);
            intent.putExtra("uSoda", uSoda);
//            intent.putExtra("colaPrice", colaPrice);
//            intent.putExtra("colaPrice", uCider);
//            intent.putExtra("colaPrice", uFanta);
//            intent.putExtra("uSoda", uSoda);
            startActivity(intent);
        }
        }


        }



