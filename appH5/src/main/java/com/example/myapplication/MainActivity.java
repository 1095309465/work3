package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.myapplication.activitys.WebActivity;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {
    String phone = "18856907654";
    String key = "5778e9d9cf089fc3b093b162036fc0e1";
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        interTest();
//        interTerst2();
//        interTest3();
    }

    public void interTest() {
        ApiUtils
                .newInstance()
                .getCityBean(phone, key)
                .flatMap(new Function<CityBean, ObservableSource<ResponseBody>>() {
                    @Override
                    public ObservableSource<ResponseBody> apply(CityBean cityBean) throws Exception {
                        Log.e(TAG, "interTest -11=" + Thread.currentThread().getName());
                        Log.e(TAG, "interTest -12=" + cityBean.toString());
                        return ApiUtils.newInstance().postFile(phone, key);
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ResponseBody>() {
                    @Override
                    public void accept(ResponseBody responseBody) throws Exception {
                        Log.e(TAG, "interTest-21= " + Thread.currentThread().getName());
                        Log.e(TAG, "interTest= " + responseBody.toString());
                    }
                });
//
//      .subscribe(new Action1<CityBean>() {
//                    @Override
//                    public void call(CityBean cityBean) {
//                        Log.e(TAG,"call1= "+cityBean.toString());
//                    }
//                });

//        ApiUtils.newInstance().getCityBean(phone,key).enqueue(new Callback<CityBean>() {
//            @Override
//            public void onResponse(Call<CityBean> call, Response<CityBean> response) {
//                Log.e(TAG,"onResponse= "+response.body().toString());
//
//            }
//
//            @Override
//            public void onFailure(Call<CityBean> call, Throwable t) {
//                Log.e(TAG,"onFailure= "+t.getMessage());
//            }
//        });
    }

    public void interTerst2() {
//        ApiUtils.newInstance().postFile("18856907654", "5778e9d9cf089fc3b093b162036fc0e1").enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                Log.e(TAG,"onResponse2= "+response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Log.e(TAG,"onFailure2= "+t.getMessage());
//            }
//        });

    }

    public void interTest3() {
//        Map<String,String> map=new HashMap<>();
//        map.put("phone","18856907654");
//        map.put("key","5778e9d9cf089fc3b093b162036fc0e1");
//        ApiUtils.newInstance().postFile(map).enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                Log.e(TAG,"onResponse3= "+response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Log.e(TAG,"onFailure3= "+t.getMessage());
//            }
//        });
    }

//    public void file() {
//        File[] folders = null;
//        Observable.fromArray(folders)//数组
//                .flatMap(new Function<File, ObservableSource<File>>() {
//                    @Override
//                    public ObservableSource<File> apply(File file) throws Exception {
//
//                        return Observable.fromArray(file.listFiles());
//                    }
//                })
//                .filter(new Func1<File, Boolean>() {//过滤器，返回boolean
//                    @Override
//                    public Boolean call(File file) {
//                        return file.getName().endsWith(".png");
//                    }
//                }).map(new Func1<File, Bitmap>() {//转换器
//            @Override
//            public Bitmap call(File file) {
//                return BitmapFactory.decodeFile(file.getName());
//            }
//        }).subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<Bitmap>() {
//                    @Override
//                    public void call(Bitmap bitmap) {
//                        ImageView iv = null;
//                        iv.setImageBitmap(bitmap);
//                    }
//                });
//    }

    public void test() {
//        String[] words={"Hello","Hi","Aloha"};
//        Observable observable=Observable.from(words);
//
//
//        Observable.from(words).subscribe(new Action1<String>() {
//            @Override
//            public void call(String s) {
//                Log.e("123","打印"+s);
//
//            }
//        });
//        int drawableRes=0;
//
//        Observable.create(new Observable.OnSubscribe<Drawable>() {
//            @Override
//            public void call(Subscriber<? super Drawable> subscriber) {
////                Drawable  drawable=getTheme().getDrawable(null);
////                subscriber.onNext(drawable);
////                subscriber.onCompleted();
//
//            }
//        })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//       .subscribe(new Observer<Drawable>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Drawable drawable) {
//
//            }
//        });
//
//        Observable.just("image")
//                .map(new Func1<String, Bitmap>() {
//                    @Override
//                    public Bitmap call(String s) {
//                        return null;
//                    }
//                })
//                .subscribe(new Action1<Bitmap>() {
//                    @Override
//                    public void call(Bitmap bitmap) {
//
//                    }
//                });
//
//        final List<Student> students = new ArrayList<>();
//        students.add(new Student("張三", 20));
//        students.add(new Student("李四", 10));
//        students.add(new Student("王五", 29));
//        students.add(new Student("李四", 10));
//        students.add(new Student("我", 10));
//        students.add(new Student("王五", 29));
//
////        List<Student> ->  List<Student.Course>  -> String
//
//        Observable.from(students)
//                .filter(new Func1<Student, Boolean>() {//判断过滤器
//                    @Override
//                    public Boolean call(Student student) {
//                        return !student.getName().equals("我");
//                    }
//                })
//                .flatMap(new Func1<Student, Observable<Student.Course>>() {
//                    @Override
//                    public Observable<Student.Course> call(Student student) {
//                        return Observable.from(student.strList);
//                    }
//                }).subscribe(new Action1<Student.Course>() {
//            @Override
//            public void call(Student.Course course) {
//                Log.e("123321", "course=" + course.getCourseName());
//
//            }
//        });
//
//        Subscriber subscriber=new Subscriber<Student.Course>() {
//
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Student.Course course) {
//
//            }
//        };
//        Observable observable=   Observable.from(students)
//                .flatMap(new Func1<Student, Observable<Student.Course>>() {
//                    @Override
//                    public Observable<Student.Course> call(Student student) {
//                        return Observable.from(student.getStrList());
//                    }
//                });
//        observable.subscribe(subscriber);
//        subscriber.unsubscribe();
//


    }
    public void btn_web(View view) {
        startActivity(new Intent(this, WebActivity.class));
    }


    class Student {

        public String name;
        public int age;

        public List<Course> strList;

        public List<Course> getStrList() {
            return strList;
        }

        public void setStrList(List<Course> strList) {
            this.strList = strList;
        }

        public class Course {
            public String courseName;

            public Course(String courseName) {
                this.courseName = courseName;
            }

            public String getCourseName() {
                return courseName;
            }

            public void setCourseName(String courseName) {
                this.courseName = courseName;
            }


        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            strList = new ArrayList<>();
            strList.add(new Course("数学"));
            strList.add(new Course("语文"));
            strList.add(new Course("体育"));
            strList.add(new Course("科学"));
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
