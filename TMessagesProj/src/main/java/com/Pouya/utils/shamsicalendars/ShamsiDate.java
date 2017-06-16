.class public Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
.super Ljava/lang/Object;
.source "ShamsiDate.java"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final SHAMSI_DATE_PATTERN:Ljava/util/regex/Pattern;

.field public static final TIME_PATTERN:Ljava/util/regex/Pattern;


# instance fields
.field private day:I

.field private hour:I

.field private minute:I

.field private month:I

.field private second:I

.field private smallYear:I

.field private year:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 22
    const-string v0, "0*1[34]\\d\\d[/\\\\-]0*([1-9]|1[012])[/\\\\-]0*([1-9]|[12]\\d|3[01])"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->SHAMSI_DATE_PATTERN:Ljava/util/regex/Pattern;

    .line 23
    const-string v0, "0*(|[12])\\d:0*(|[1-5])\\d(:(0*(|[1-5])\\d)|)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->TIME_PATTERN:Ljava/util/regex/Pattern;

    .line 24
    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method public constructor <init>(III)V
    .registers 11
    .param p1, "i"    # I
    .param p2, "i2"    # I
    .param p3, "i3"    # I

    .prologue
    const/4 v4, 0x0

    .line 30
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v5, v4

    move v6, v4

    invoke-direct/range {v0 .. v6}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;-><init>(IIIIII)V

    .line 31
    return-void
.end method

.method public constructor <init>(IIIII)V
    .registers 13
    .param p1, "i"    # I
    .param p2, "i2"    # I
    .param p3, "i3"    # I
    .param p4, "i4"    # I
    .param p5, "i5"    # I

    .prologue
    .line 34
    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;-><init>(IIIIII)V

    .line 35
    return-void
.end method

.method public constructor <init>(IIIIII)V
    .registers 7
    .param p1, "i"    # I
    .param p2, "i2"    # I
    .param p3, "i3"    # I
    .param p4, "i4"    # I
    .param p5, "i5"    # I
    .param p6, "i6"    # I

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-direct {p0, p1}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setYear(I)V

    .line 40
    invoke-direct {p0, p2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setMonth(I)V

    .line 41
    invoke-direct {p0, p3}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setDay(I)V

    .line 42
    invoke-direct {p0, p4}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setHour(I)V

    .line 43
    invoke-direct {p0, p5}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setMinute(I)V

    .line 44
    invoke-direct {p0, p6}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setSecond(I)V

    .line 45
    return-void
.end method

.method private static isDateValid(Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;)V
    .registers 3
    .param p0, "shamsiDate"    # Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    .prologue
    .line 48
    invoke-static {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiCalendar;->shamsiToDate(Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiCalendar;->dateToShamsi(Ljava/util/Date;)Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    move-result-object v0

    invoke-virtual {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->toDateString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->toDateString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    .line 51
    :cond_16
    return-void
.end method

.method public static parseDate(Ljava/lang/String;)Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
    .registers 4
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 54
    if-eqz p0, :cond_c

    const-string v2, "arm"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 71
    :cond_a
    :goto_a
    const/4 v0, 0x0

    :goto_b
    return-object v0

    .line 56
    :cond_c
    sget-object v2, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->SHAMSI_DATE_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 57
    new-instance v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    invoke-direct {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;-><init>()V

    .line 59
    .local v0, "shamsiDate":Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
    :try_start_1d
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, " -/\\"

    invoke-direct {v1, p0, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .local v1, "stringTokenizer":Ljava/util/StringTokenizer;
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setYear(I)V

    .line 61
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setMonth(I)V

    .line 62
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setDay(I)V

    .line 63
    invoke-static {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->isDateValid(Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;)V
    :try_end_48
    .catch Ljava/lang/Throwable; {:try_start_1d .. :try_end_48} :catch_49

    goto :goto_b

    .line 65
    .end local v1    # "stringTokenizer":Ljava/util/StringTokenizer;
    :catch_49
    move-exception v2

    goto :goto_a
.end method

.method public static parseTime(Ljava/lang/String;)Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
    .registers 4
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 75
    if-eqz p0, :cond_c

    const-string v2, "arm"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 93
    :cond_a
    :goto_a
    const/4 v0, 0x0

    :cond_b
    :goto_b
    return-object v0

    .line 77
    :cond_c
    sget-object v2, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->TIME_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 79
    :try_start_18
    new-instance v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    invoke-direct {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;-><init>()V

    .line 80
    .local v0, "shamsiDate":Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, " :-/"

    invoke-direct {v1, p0, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .local v1, "stringTokenizer":Ljava/util/StringTokenizer;
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setHour(I)V

    .line 82
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setMinute(I)V

    .line 83
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 84
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setSecond(I)V
    :try_end_4b
    .catch Ljava/lang/Throwable; {:try_start_18 .. :try_end_4b} :catch_4c

    goto :goto_b

    .line 87
    .end local v0    # "shamsiDate":Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
    .end local v1    # "stringTokenizer":Ljava/util/StringTokenizer;
    :catch_4c
    move-exception v2

    goto :goto_a
.end method

.method private setDay(I)V
    .registers 4
    .param p1, "i"    # I

    .prologue
    .line 97
    const/4 v0, 0x1

    if-lt p1, v0, :cond_7

    const/16 v0, 0x1f

    if-le p1, v0, :cond_f

    .line 98
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Day must be between 1 and 31"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_f
    iput p1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    .line 101
    return-void
.end method

.method private setHour(I)V
    .registers 4
    .param p1, "i"    # I

    .prologue
    .line 104
    if-ltz p1, :cond_6

    const/16 v0, 0x18

    if-lt p1, v0, :cond_e

    .line 105
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Hour must be between 0 and 23"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_e
    iput p1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->hour:I

    .line 108
    return-void
.end method

.method private setMinute(I)V
    .registers 4
    .param p1, "i"    # I

    .prologue
    .line 111
    if-ltz p1, :cond_6

    const/16 v0, 0x3c

    if-lt p1, v0, :cond_e

    .line 112
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Minute must be between 0 and 59"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :cond_e
    iput p1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->minute:I

    .line 115
    return-void
.end method

.method private setMonth(I)V
    .registers 4
    .param p1, "i"    # I

    .prologue
    .line 119
    const/4 v0, 0x1

    if-lt p1, v0, :cond_7

    const/16 v0, 0xc

    if-le p1, v0, :cond_f

    .line 120
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Month must be between 1 and 12"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :cond_f
    iput p1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    .line 123
    return-void
.end method

.method private setSecond(I)V
    .registers 4
    .param p1, "i"    # I

    .prologue
    .line 126
    if-ltz p1, :cond_6

    const/16 v0, 0x3c

    if-lt p1, v0, :cond_e

    .line 127
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Second must be between 0 and 59"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_e
    iput p1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->second:I

    .line 130
    return-void
.end method

.method private setSmallYear(I)V
    .registers 4
    .param p1, "i"    # I

    .prologue
    .line 133
    if-ltz p1, :cond_5

    .line 134
    iput p1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->smallYear:I

    .line 135
    return-void

    .line 137
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Small Year must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private setYear(I)V
    .registers 4
    .param p1, "i"    # I

    .prologue
    .line 141
    if-ltz p1, :cond_a

    .line 142
    iput p1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    .line 143
    rem-int/lit8 v0, p1, 0x64

    invoke-direct {p0, v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->setSmallYear(I)V

    .line 144
    return-void

    .line 146
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Year must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public add(II)V
    .registers 15
    .param p1, "i"    # I
    .param p2, "i2"    # I

    .prologue
    const/16 v11, 0x1f

    const/16 v7, 0x1e

    const/4 v10, 0x1

    const/16 v9, 0x1d

    const/16 v8, 0xc

    .line 150
    const/16 v1, 0x1e

    .line 151
    .local v1, "i3":I
    const/4 v5, 0x2

    if-ne p1, v5, :cond_82

    .line 152
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    add-int/2addr v5, p2

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    .line 153
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    if-gtz v5, :cond_2f

    .line 154
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    add-int/lit8 v5, v5, 0xc

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    .line 155
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    add-int/lit8 v5, v5, -0x1

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    .line 160
    :cond_23
    :goto_23
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    const/4 v6, 0x7

    if-ge v5, v6, :cond_40

    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    if-le v5, v11, :cond_40

    .line 161
    iput v11, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    .line 188
    :cond_2e
    :goto_2e
    return-void

    .line 156
    :cond_2f
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    if-le v5, v8, :cond_23

    .line 157
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    add-int/lit8 v5, v5, -0xc

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    .line 158
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    goto :goto_23

    .line 162
    :cond_40
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    if-ge v5, v8, :cond_4b

    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    if-le v5, v7, :cond_4b

    .line 163
    iput v7, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    goto :goto_2e

    .line 164
    :cond_4b
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    if-ne v5, v8, :cond_2e

    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    if-le v5, v9, :cond_2e

    .line 165
    new-instance v5, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    iget v6, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    iget v7, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    invoke-direct {v5, v6, v7, v9}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;-><init>(III)V

    invoke-static {v5}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiCalendar;->shamsiToDate(Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;)Ljava/util/Date;

    move-result-object v4

    .line 166
    .local v4, "shamsiToDate":Ljava/util/Date;
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 167
    .local v2, "instance":Ljava/util/Calendar;
    invoke-virtual {v2, v4}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 168
    const/4 v5, 0x5

    invoke-virtual {v2, v5, v10}, Ljava/util/Calendar;->add(II)V

    .line 169
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    invoke-static {v5}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiCalendar;->dateToShamsi(Ljava/util/Date;)Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    move-result-object v5

    invoke-virtual {v5}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMonth()I

    move-result v5

    if-eq v5, v8, :cond_7b

    .line 170
    const/16 v1, 0x1d

    .line 172
    :cond_7b
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    if-le v5, v1, :cond_2e

    .line 173
    iput v9, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    goto :goto_2e

    .line 176
    .end local v2    # "instance":Ljava/util/Calendar;
    .end local v4    # "shamsiToDate":Ljava/util/Date;
    :cond_82
    if-ne p1, v10, :cond_94

    .line 177
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    add-int/2addr v5, p2

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    .line 178
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    if-gez v5, :cond_91

    const/4 v5, 0x0

    :goto_8e
    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    goto :goto_2e

    :cond_91
    iget v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    goto :goto_8e

    .line 180
    :cond_94
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 181
    .local v3, "instance2":Ljava/util/Calendar;
    invoke-static {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiCalendar;->shamsiToDate(Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;)Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 182
    invoke-virtual {v3, p1, p2}, Ljava/util/Calendar;->add(II)V

    .line 183
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    invoke-static {v5}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiCalendar;->dateToShamsi(Ljava/util/Date;)Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    move-result-object v0

    .line 184
    .local v0, "dateToShamsi":Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
    invoke-virtual {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getYear()I

    move-result v5

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    .line 185
    invoke-virtual {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMonth()I

    move-result v5

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    .line 186
    invoke-virtual {v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getDay()I

    move-result v5

    iput v5, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    goto/16 :goto_2e
.end method

.method public compareTo(Ljava/lang/Object;)I
    .registers 6
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 191
    move-object v0, p1

    check-cast v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    .line 192
    .local v0, "shamsiDate":Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;
    if-eqz v0, :cond_4f

    .line 193
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    if-eq v1, v2, :cond_11

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    sub-int/2addr v1, v2

    :goto_10
    return v1

    :cond_11
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    if-eq v1, v2, :cond_1d

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    sub-int/2addr v1, v2

    goto :goto_10

    :cond_1d
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    if-eq v1, v2, :cond_29

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    sub-int/2addr v1, v2

    goto :goto_10

    :cond_29
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->hour:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->hour:I

    if-eq v1, v2, :cond_35

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->hour:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->hour:I

    sub-int/2addr v1, v2

    goto :goto_10

    :cond_35
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->minute:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->minute:I

    if-eq v1, v2, :cond_41

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->minute:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->minute:I

    sub-int/2addr v1, v2

    goto :goto_10

    :cond_41
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->second:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->second:I

    if-eq v1, v2, :cond_4d

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->second:I

    iget v2, v0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->second:I

    sub-int/2addr v1, v2

    goto :goto_10

    :cond_4d
    const/4 v1, 0x0

    goto :goto_10

    .line 195
    :cond_4f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Object must not be null and must be of type ShamsiDate: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getDay()I
    .registers 2

    .prologue
    .line 200
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    return v0
.end method

.method public getDayInYear()I
    .registers 3

    .prologue
    .line 204
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    const/4 v1, 0x7

    if-ge v0, v1, :cond_f

    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    add-int/2addr v0, v1

    :goto_e
    return v0

    :cond_f
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    const/16 v1, 0xc

    if-gt v0, v1, :cond_21

    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    add-int/lit8 v0, v0, -0x7

    mul-int/lit8 v0, v0, 0x1e

    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->day:I

    add-int/2addr v0, v1

    add-int/lit16 v0, v0, 0xba

    goto :goto_e

    :cond_21
    const/4 v0, 0x0

    goto :goto_e
.end method

.method public getHour()I
    .registers 2

    .prologue
    .line 208
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->hour:I

    return v0
.end method

.method public getMinute()I
    .registers 2

    .prologue
    .line 212
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->minute:I

    return v0
.end method

.method public getMonth()I
    .registers 2

    .prologue
    .line 216
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->month:I

    return v0
.end method

.method public getSecond()I
    .registers 2

    .prologue
    .line 220
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->second:I

    return v0
.end method

.method public getSmallYear()I
    .registers 2

    .prologue
    .line 224
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->smallYear:I

    return v0
.end method

.method public getWeekOfYear()I
    .registers 12

    .prologue
    const/4 v10, 0x7

    const/4 v7, 0x1

    .line 228
    const/4 v1, 0x0

    .line 229
    .local v1, "i":I
    new-instance v8, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;

    iget v9, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    invoke-direct {v8, v9, v7, v7}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;-><init>(III)V

    invoke-static {v8}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiCalendar;->shamsiToDate(Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;)Ljava/util/Date;

    move-result-object v6

    .line 230
    .local v6, "shamsiToDate":Ljava/util/Date;
    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getDayInYear()I

    move-result v0

    .line 231
    .local v0, "dayInYear":I
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 232
    .local v5, "instance":Ljava/util/Calendar;
    invoke-virtual {v5, v6}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 233
    invoke-virtual {v5, v10}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 234
    .local v2, "i2":I
    const/4 v3, 0x0

    .line 235
    .local v3, "i3":I
    :goto_1e
    if-eq v2, v10, :cond_2d

    .line 236
    add-int/lit8 v2, v3, 0x1

    .line 237
    const/4 v8, 0x6

    invoke-virtual {v5, v8, v7}, Ljava/util/Calendar;->add(II)V

    .line 238
    move v4, v2

    .line 239
    .local v4, "i4":I
    invoke-virtual {v5, v10}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 240
    move v3, v4

    .line 241
    goto :goto_1e

    .line 242
    .end local v4    # "i4":I
    :cond_2d
    if-lez v3, :cond_33

    move v2, v7

    .line 243
    :goto_30
    if-gt v0, v3, :cond_35

    .line 251
    .end local v2    # "i2":I
    :goto_32
    return v2

    .line 242
    .restart local v2    # "i2":I
    :cond_33
    const/4 v2, 0x0

    goto :goto_30

    .line 246
    :cond_35
    sub-int v3, v0, v3

    .line 247
    div-int/lit8 v0, v3, 0x7

    .line 248
    rem-int/lit8 v7, v3, 0x7

    if-eqz v7, :cond_3e

    .line 249
    const/4 v1, 0x1

    .line 251
    :cond_3e
    add-int v7, v1, v0

    add-int/2addr v2, v7

    goto :goto_32
.end method

.method public getYear()I
    .registers 2

    .prologue
    .line 255
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->year:I

    return v0
.end method

.method public toDateString()Ljava/lang/String;
    .registers 2

    .prologue
    .line 259
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->toDateString(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toDateString(C)Ljava/lang/String;
    .registers 4
    .param p1, "c"    # C

    .prologue
    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getYear()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMonth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getDay()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toReverseDateString()Ljava/lang/String;
    .registers 2

    .prologue
    .line 267
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->toReverseDateString(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toReverseDateString(C)Ljava/lang/String;
    .registers 4
    .param p1, "c"    # C

    .prologue
    .line 271
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getDay()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMonth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getYear()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .prologue
    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getYear()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMonth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getDay()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getHour()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMinute()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getSecond()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toTimeString()Ljava/lang/String;
    .registers 2

    .prologue
    .line 279
    const/16 v0, 0x3a

    invoke-virtual {p0, v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->toTimeString(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toTimeString(C)Ljava/lang/String;
    .registers 3
    .param p1, "c"    # C

    .prologue
    .line 283
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->toTimeString(CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toTimeString(CZ)Ljava/lang/String;
    .registers 7
    .param p1, "c"    # C
    .param p2, "z"    # Z

    .prologue
    const/16 v3, 0x9

    .line 287
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getHour()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMinute()I

    move-result v1

    if-le v1, v3, :cond_32

    const-string v1, "arm"

    :goto_1f
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getMinute()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 288
    .local v0, "str":Ljava/lang/String;
    if-nez p2, :cond_35

    .line 291
    .end local v0    # "str":Ljava/lang/String;
    :goto_31
    return-object v0

    .line 287
    :cond_32
    const-string v1, "0"

    goto :goto_1f

    .line 291
    .restart local v0    # "str":Ljava/lang/String;
    :cond_35
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getSecond()I

    move-result v1

    if-le v1, v3, :cond_5b

    const-string v1, "arm"

    :goto_4a
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->getSecond()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_31

    :cond_5b
    const-string v1, "0"

    goto :goto_4a
.end method

.method public toTimeString(Z)Ljava/lang/String;
    .registers 3
    .param p1, "z"    # Z

    .prologue
    .line 295
    const/16 v0, 0x3a

    invoke-virtual {p0, v0, p1}, Lorg/pouyadr/Pouya/utils/shamsicalendars/ShamsiDate;->toTimeString(CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
