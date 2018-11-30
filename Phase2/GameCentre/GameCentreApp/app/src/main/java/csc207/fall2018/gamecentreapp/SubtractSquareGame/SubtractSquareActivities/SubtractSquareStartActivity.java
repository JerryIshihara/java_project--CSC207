package csc207.fall2018.gamecentreapp.SubtractSquareGame.SubtractSquareActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import csc207.fall2018.gamecentreapp.R;

public class SubtractSquareStartActivity extends AppCompatActivity {

//    private SubtractSquareGame subtractSquareGame;

    //    private final static String TEMP_FILE_NAME = "temp_file.ser";
    private SubtractSquareController subtractSquareController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract_square_start);

        subtractSquareController = new SubtractSquareController(this);


//        subtractSquareGame = new SubtractSquareGame("", "");
//        saveToDataBase(this, subtractSquareGame, SubtractSquareGame.getGameName());
    }


    public void onclickStart(View view) {
        final EditText p1Name = (EditText) findViewById(R.id.p1Name);
        final EditText p2Name = (EditText) findViewById(R.id.p2Name);
        String p1 = p1Name.getText().toString();
        String p2 = p2Name.getText().toString();

        /*final EditText p1Name = (EditText) findViewById(R.id.p1Name);
        final EditText p2Name = (EditText) findViewById(R.id.p2Name);
        String p1 = p1Name.getText().toString();
        String p2 = p2Name.getText().toString();*/
        subtractSquareController.twoPlayerNewGame(view, p1, p2);

        /*if (!(p1.equals("") || p2.equals(""))) {
            if (p2.equals("PC")) {
                Toast.makeText(getApplicationContext(), "PC is a reserved name for PC MODE", Toast.LENGTH_SHORT).show();
            } else {
                SubtractSquareGame subtractSquareGame = new SubtractSquareGame(p1, p2);
                saveToDataBase(this, subtractSquareGame, SubtractSquareGame.getGameName());
                switchToGame();
            }
        } else {
            Toast.makeText(getApplicationContext(), "Please enter your name.", Toast.LENGTH_SHORT).show();
        }*/
    }

    public void onclickGoBack(View view) {
        Intent goBackIntent = new Intent(getApplicationContext(), SubtractSquareSelectActivity.class);
        startActivity(goBackIntent);
    }


//    /**
//     * Load the board manager from fileName.
//     *
//     * @param fileName the name of the file
//     */
//    private void loadFromFile(String fileName) {
//
//        try {
//            InputStream inputStream = this.openFileInput(fileName);
//            if (inputStream != null) {
//                ObjectInputStream input = new ObjectInputStream(inputStream);
//                subtractSquareGame = (SubtractSquareGame) input.readObject();
//                inputStream.close();
//            }
//        } catch (FileNotFoundException e) {
//            Log.e("login activity", "File not found: " + e.toString());
//        } catch (IOException e) {
//            Log.e("login activity", "Can not read file: " + e.toString());
//        } catch (ClassNotFoundException e) {
//            Log.e("login activity", "File contained unexpected data type: " + e.toString());
//        }
//    }

//    /**
//     * Save the subtract square to fileName.
//     *
//     * @param fileName the name of the file
//     */
//    public void saveToFile(String fileName) {
//        try {
//            File outputFile = new File(getFilesDir(), fileName);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(outputFile));
//            objectOutputStream.writeObject(subtractSquareGame);
//            objectOutputStream.close();
//        } catch (IOException e) {
//            Log.e("Exception", "File write failed: " + e.toString());
//        }
//    }

//    private void switchToGame() {
//        Intent tmp = new Intent(this, SubtractSquareActivity.class);
//        tmp.putExtra("PC_MODE", false);
//        startActivity(tmp);
//    }
}