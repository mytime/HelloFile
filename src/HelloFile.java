import java.io.File;
import java.io.IOException;

/**
 * Created by iwan on 16/1/10.
 */
public class HelloFile {
    public static void main(String[] args){

        /**
         * 文件的创建,删除,重命名方法
         */

        //定义文件对象,
        //文件可指定路径,这里使用相对路径,保存在当前工程根目录
        // ../hello.txt 创建到当前工程目录的上一级目录
        //  ../../ 上一级的上一级
        File file = new File("hello.txt");

        //判断文件是否存在
        if(file.exists()){

            //重命名文件
            //可指定重命名后保存的路径,但必须在同一个分区(wondow系统)
            File nameto = new File("new Hello.txt");
            System.out.println("文件被重命名了");

//            System.out.println("是否是文件:"+file.isFile());
//
//            System.out.println("是否是目录:"+file.isDirectory());
//
//            //删除文件
//            file.delete();
//            System.out.println("文件删除成功");


        }else {
            System.out.println("文件不存在");

            //创建文件

            try {


                file.createNewFile();
                System.out.println("成功创建文件");


            } catch (IOException e) {
                System.out.println("发生异常,文件无法创建");
            }
        }



    }
}
