package com.smart.dialogsamples.utils;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

import com.smart.dialogsamples.ui.DialogHomeActivity;
import com.smart.animation.Attention.Flash;
import com.smart.animation.Attention.RubberBand;
import com.smart.animation.Attention.ShakeHorizontal;
import com.smart.animation.Attention.ShakeVertical;
import com.smart.animation.Attention.Swing;
import com.smart.animation.Attention.Tada;
import com.smart.animation.BaseAnimatorSet;
import com.smart.animation.BounceEnter.BounceBottomEnter;
import com.smart.animation.BounceEnter.BounceEnter;
import com.smart.animation.BounceEnter.BounceLeftEnter;
import com.smart.animation.BounceEnter.BounceRightEnter;
import com.smart.animation.BounceEnter.BounceTopEnter;
import com.smart.animation.FadeEnter.FadeEnter;
import com.smart.animation.FadeExit.FadeExit;
import com.smart.animation.FallEnter.FallEnter;
import com.smart.animation.FallEnter.FallRotateEnter;
import com.smart.animation.FlipEnter.FlipBottomEnter;
import com.smart.animation.FlipEnter.FlipHorizontalEnter;
import com.smart.animation.FlipEnter.FlipHorizontalSwingEnter;
import com.smart.animation.FlipEnter.FlipLeftEnter;
import com.smart.animation.FlipEnter.FlipRightEnter;
import com.smart.animation.FlipEnter.FlipTopEnter;
import com.smart.animation.FlipEnter.FlipVerticalEnter;
import com.smart.animation.FlipEnter.FlipVerticalSwingEnter;
import com.smart.animation.FlipExit.FlipHorizontalExit;
import com.smart.animation.FlipExit.FlipVerticalExit;
import com.smart.animation.Jelly;
import com.smart.animation.NewsPaperEnter;
import com.smart.animation.SlideEnter.SlideBottomEnter;
import com.smart.animation.SlideEnter.SlideLeftEnter;
import com.smart.animation.SlideEnter.SlideRightEnter;
import com.smart.animation.SlideEnter.SlideTopEnter;
import com.smart.animation.SlideExit.SlideBottomExit;
import com.smart.animation.SlideExit.SlideLeftExit;
import com.smart.animation.SlideExit.SlideRightExit;
import com.smart.animation.SlideExit.SlideTopExit;
import com.smart.animation.ZoomEnter.ZoomInBottomEnter;
import com.smart.animation.ZoomEnter.ZoomInEnter;
import com.smart.animation.ZoomEnter.ZoomInLeftEnter;
import com.smart.animation.ZoomEnter.ZoomInRightEnter;
import com.smart.animation.ZoomEnter.ZoomInTopEnter;
import com.smart.animation.ZoomExit.ZoomInExit;
import com.smart.animation.ZoomExit.ZoomOutBottomExit;
import com.smart.animation.ZoomExit.ZoomOutExit;
import com.smart.animation.ZoomExit.ZoomOutLeftExit;
import com.smart.animation.ZoomExit.ZoomOutRightExit;
import com.smart.animation.ZoomExit.ZoomOutTopExit;
import com.smart.dialog.listener.OnOperItemClickL;
import com.smart.dialog.widget.ActionSheetDialog;

import java.util.ArrayList;

public class DiaogAnimChoose {
    public static void showAnim(final Context context) {
        final Class<?> cs[] = {BounceEnter.class,//
                BounceTopEnter.class,//
                BounceBottomEnter.class,//
                BounceLeftEnter.class,//
                BounceRightEnter.class,//
                FlipHorizontalEnter.class,//
                FlipHorizontalSwingEnter.class,//
                FlipVerticalEnter.class,//
                FlipVerticalSwingEnter.class,//
                FlipTopEnter.class,//
                FlipBottomEnter.class,//
                FlipLeftEnter.class,//
                FlipRightEnter.class,//
                FadeEnter.class, //
                FallEnter.class,//
                FallRotateEnter.class,//
                SlideTopEnter.class,//
                SlideBottomEnter.class,//
                SlideLeftEnter.class, //
                SlideRightEnter.class,//
                ZoomInEnter.class,//
                ZoomInTopEnter.class,//
                ZoomInBottomEnter.class,//
                ZoomInLeftEnter.class,//
                ZoomInRightEnter.class,//

                NewsPaperEnter.class,//
                Flash.class,//
                ShakeHorizontal.class,//
                ShakeVertical.class,//
                Jelly.class,//
                RubberBand.class,//
                Swing.class,//
                Tada.class,//
        };

        ArrayList<String> itemList = new ArrayList<>();
        for (Class<?> c : cs) {
            itemList.add(c.getSimpleName());
        }

        final String[] contents = new String[itemList.size()];
        final ActionSheetDialog dialog = new ActionSheetDialog(context, //
                itemList.toArray(contents), null);
        dialog.title("使用内置show动画设置对话框显示动画\r\n指定对话框将显示效果")//
                .titleTextSize_SP(14.5f)//
                .layoutAnimation(null)//
                .cancelText("cancel")
                .show();
        dialog.setCanceledOnTouchOutside(false);

        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    String animType = contents[position];
                    ((DialogHomeActivity) context).setBasIn((BaseAnimatorSet) cs[position].newInstance());
                    T.showShort(context, animType + "设置成功");
                    dialog.dismiss();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void dissmissAnim(final Context context) {
        final Class<?> cs[] = {FlipHorizontalExit.class,//
                FlipVerticalExit.class,//
                FadeExit.class,//
                SlideTopExit.class,//
                SlideBottomExit.class,//
                SlideLeftExit.class, //
                SlideRightExit.class,//
                ZoomOutExit.class,//
                ZoomOutTopExit.class,//
                ZoomOutBottomExit.class,//
                ZoomOutLeftExit.class,//
                ZoomOutRightExit.class,//
                ZoomInExit.class,//
        };

        ArrayList<String> itemList = new ArrayList<String>();
        for (Class<?> c : cs) {
            itemList.add(c.getSimpleName());
        }

        final String[] contents = new String[itemList.size()];
        final ActionSheetDialog dialog = new ActionSheetDialog(context, //
                itemList.toArray(contents), null);
        dialog.title("使用内置dismiss动画设置对话框消失动画\r\n指定对话框将消失效果")//
                .titleTextSize_SP(14.5f)//
                .cancelText("cancel")
                .show();

        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    String animType = contents[position];
                    ((DialogHomeActivity) context).setBasOut((BaseAnimatorSet) cs[position].newInstance());
                    T.showShort(context, animType + "设置成功");
                    dialog.dismiss();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
