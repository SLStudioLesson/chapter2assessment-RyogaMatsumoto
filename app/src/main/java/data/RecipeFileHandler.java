package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RecipeFileHandler {
    private String filePath;

    public RecipeFileHandler() {
        filePath = "app/src/main/resources/recipes.txt";
    }

    public RecipeFileHandler(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 設問1: 一覧表示機能
     * recipes.txtからレシピデータを読み込み、それをリスト形式で返します。 <br>
     * IOExceptionが発生したときは<i>Error reading file: 例外のメッセージ</i>とコンソールに表示します。
     *
     * @return レシピデータ
     */
    public ArrayList<String> readRecipes() {
        // ファイルの読み込み
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // ファイル内に何も入っていなければ「No recipes available」と表示  入っていれば「Recipes:」と表示
            if ((line = reader.readLine()) == null) {
                System.out.println("\nNo recipes available.");
            } else {
                System.out.println("\nRecipes:");
            }
            // ファイルの中身を最後まで出力
            while ((line = reader.readLine()) != null) {
                String[] str1 = line.split(",");
                System.out.println("-----------------------------------");
                System.out.println("Recipe Name: " + str1[0]);
                System.out.println("Main Ingredients: " + line.substring(line.indexOf(",") + 1));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    /**
     * 設問2: 新規登録機能
     * 新しいレシピをrecipes.txtに追加します。<br>
     * レシピ名と材料はカンマ区切りで1行としてファイルに書き込まれます。
     *
     * @param recipeName レシピ名
     * @param ingredients 材料名
     */
     //
    public void addRecipe(String recipeName, String ingredients) {
        //System.out.println(recipeName + ingredients);
        // try {

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
    }
}
