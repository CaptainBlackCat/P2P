package com.atguigu.p2p.adapter;

import android.view.View;
import android.widget.TextView;

import com.atguigu.p2p.R;
import com.atguigu.p2p.bean.Product;
import com.atguigu.p2p.ui.RoundProgress;
import com.atguigu.p2p.utils.UIUtils;

import butterknife.BindView;

/**
 * Created by xpf on 2016/11/15 :)
 * Wechat:18091383534
 * Function:BaseHolder的实现类
 */

public class MyHolder extends BaseHolder<Product> {

    @BindView(R.id.p_name)
    TextView pName;
    @BindView(R.id.p_money)
    TextView pMoney;
    @BindView(R.id.p_yearlv)
    TextView pYearlv;
    @BindView(R.id.p_suodingdays)
    TextView pSuodingdays;
    @BindView(R.id.p_minzouzi)
    TextView pMinzouzi;
    @BindView(R.id.p_minnum)
    TextView pMinnum;
    @BindView(R.id.p_progresss)
    RoundProgress pProgresss;

    @Override
    protected void refreshData() {
        Product data = getData();
        pName.setText(data.name);
        pMinnum.setText(data.memberNum);
        pMoney.setText(data.money);
        pYearlv.setText(data.yearRate);
        pSuodingdays.setText(data.suodingDays);
        pMinzouzi.setText(data.minTouMoney);
        pProgresss.setProgress(Integer.parseInt(data.progress));
    }

    @Override
    protected View initView() {
        return UIUtils.getView(R.layout.item_product_list);
    }
}
