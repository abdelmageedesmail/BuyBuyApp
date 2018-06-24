package com.example.ahmed.buybuyapp.Fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ahmed on 3/1/2017.
 */
public class Fonts {
//fontt
    public static void set(TextView[] textViews, Context context, int fontIndex) {
        for (TextView textView : textViews) {
            Typeface font = null;

            switch (fontIndex) {

                case 0:
                    font = Typeface.createFromAsset(context.getResources().getAssets(), "bold.otf");
                    break;
                case 1:
                    font = Typeface.createFromAsset(context.getResources().getAssets(), "light.otf");
                    break;
//                case 2:
//                  font = Typeface.createFromAsset(context.getResources().getAssets(), "arabic.otf");
//                  break;

//                case 3:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(),"main_page.ttf");
//                    //font = Typeface.createFromAsset(context.getResources().getAssets(),"OpenSans-Semibold.ttf");
//                    break;
            }
            textView.setTypeface(font);
        }
    }


    public static void set(EditText[] editTexts, Context context, int fontIndex) {
        for (EditText editText : editTexts) {
            Typeface font = null;

            switch (fontIndex) {
                case 0:
                    font = Typeface.createFromAsset(context.getResources().getAssets(), "bold.otf");
                    break;
                case 1:
                    font = Typeface.createFromAsset(context.getResources().getAssets(), "light.otf");
                    break;
//                case 2:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(), "arabic.otf");
//                    break;
//                case 3:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(),"main_page.ttf");
//                    //font = Typeface.createFromAsset(context.getResources().getAssets(),"OpenSans-Semibold.ttf");
//                    break;
            }

            editText.setTypeface(font);
        }
    }

    public static void set(Button[] buttons, Context context, int fontIndex) {
        for (Button button : buttons) {
            Typeface font = null;

            switch (fontIndex) {
                case 0:
                    font = Typeface.createFromAsset(context.getResources().getAssets(), "bold.otf");
                    break;
                case 1:
                    font = Typeface.createFromAsset(context.getResources().getAssets(), "light.otf");
                    break;
//                case 2:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(), "arabic.otf");
//                    break;
//                case 3:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(),"main_page.ttf");
//                    //font = Typeface.createFromAsset(context.getResources().getAssets(),"OpenSans-Semibold.ttf");
//                    break;
            }

            button.setTypeface(font);
        }
    }
//    public static void set(Spinner[] spinners, Context context, int fontIndex) {
//        for (Spinner spinner : spinners) {
//            Typeface font = null;
//
//            switch (fontIndex) {
//                case 0:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(), "droidsans.ttf");
//                    break;
//
//                case 1:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(), "droidsans_bold.ttf");
//                    break;
//                case 2:
//                    font = Typeface.createFromAsset(context.getResources().getAssets(),"bader.ttf");
//            }
//
//            spinner.setTypeface(font);
//        }
//    }
}
