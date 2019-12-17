namespace java com.xiaomi.game.demo.thrift

enum WeekEnum {
 Monday,
 Tuesday,
 Wednesday,
 Thursday,
 Friday,
 Saturday,
 Sunday
}

struct People {
1: required string name; // 使用正整数编号
2: required i16 age;
3: optional i16 weight;
4: i32 height; // 默认optional
5: required byte sex = 0;  // 可以由默认值
}

service HelloWorld {
    string say(1:People people, 2:WeekEnum weekEnum);

    string say1();
}