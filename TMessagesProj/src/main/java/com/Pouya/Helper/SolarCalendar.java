.class public Lorg/pouyadr/Pouya/Helper/SolarCalendar;
.super Ljava/lang/Object;
.source "SolarCalendar.java"


# instance fields
.field private calendar:Ljava/util/Calendar;

.field private date:I

.field private month:I

.field private weekDay:I

.field private year:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    .line 23
    invoke-direct {p0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calSolarCalendar()V

    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/util/Calendar;)V
    .registers 2
    .param p1, "calendar"    # Ljava/util/Calendar;

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    .line 29
    invoke-direct {p0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calSolarCalendar()V

    .line 30
    return-void
.end method

.method public static Convert(J)Ljava/lang/String;
    .registers 4
    .param p0, "date"    # J

    .prologue
    .line 33
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 34
    .local v0, "c":Ljava/util/Calendar;
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 35
    new-instance v1, Lorg/pouyadr/Pouya/Helper/SolarCalendar;

    invoke-direct {v1, v0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {v1}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->getDescribedDateFormat()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private calSolarCalendar()V
    .registers 14

    .prologue
    const/16 v12, 0xba

    const/16 v11, 0x1f

    const/16 v10, 0xc

    const/4 v9, 0x1

    const/16 v8, 0x1e

    .line 39
    iget-object v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    invoke-virtual {v6, v9}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 40
    .local v4, "georgianYear":I
    iget-object v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    const/4 v7, 0x2

    invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I

    move-result v6

    add-int/lit8 v3, v6, 0x1

    .line 41
    .local v3, "georgianMonth":I
    iget-object v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    const/4 v7, 0x5

    invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 42
    .local v2, "georgianDate":I
    iget-object v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    const/4 v7, 0x7

    invoke-virtual {v6, v7}, Ljava/util/Calendar;->get(I)I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->weekDay:I

    .line 43
    new-array v0, v10, [I

    fill-array-data v0, :array_16e

    .line 44
    .local v0, "buf1":[I
    new-array v1, v10, [I

    fill-array-data v1, :array_18a

    .line 45
    .local v1, "buf2":[I
    rem-int/lit8 v6, v4, 0x4

    if-eqz v6, :cond_d4

    .line 46
    add-int/lit8 v6, v3, -0x1

    aget v6, v0, v6

    add-int/2addr v6, v2

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 47
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    const/16 v7, 0x4f

    if-le v6, v7, :cond_9d

    .line 48
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    add-int/lit8 v6, v6, -0x4f

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 49
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    if-gt v6, v12, :cond_72

    .line 50
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1f

    packed-switch v6, :pswitch_data_1a6

    .line 56
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1f

    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 57
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1f

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 60
    :goto_64
    add-int/lit16 v6, v4, -0x26d

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    .line 144
    :goto_68
    return-void

    .line 52
    :pswitch_69
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1f

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 53
    iput v11, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    goto :goto_64

    .line 62
    :cond_72
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    add-int/lit16 v6, v6, -0xba

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 63
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    packed-switch v6, :pswitch_data_1ac

    .line 69
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0x7

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 70
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 73
    :goto_8d
    add-int/lit16 v6, v4, -0x26d

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    goto :goto_68

    .line 65
    :pswitch_92
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0x6

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 66
    iput v8, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    goto :goto_8d

    .line 76
    :cond_9d
    const/16 v6, 0x7cc

    if-le v4, v6, :cond_c6

    rem-int/lit8 v6, v4, 0x4

    if-ne v6, v9, :cond_c6

    .line 77
    const/16 v5, 0xb

    .line 81
    .local v5, "ld":I
    :goto_a7
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    add-int/2addr v6, v5

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 82
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    packed-switch v6, :pswitch_data_1b2

    .line 88
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0xa

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 89
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 92
    :goto_c1
    add-int/lit16 v6, v4, -0x26e

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    goto :goto_68

    .line 79
    .end local v5    # "ld":I
    :cond_c6
    const/16 v5, 0xa

    .restart local v5    # "ld":I
    goto :goto_a7

    .line 84
    :pswitch_c9
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0x9

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 85
    iput v8, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    goto :goto_c1

    .line 95
    .end local v5    # "ld":I
    :cond_d4
    add-int/lit8 v6, v3, -0x1

    aget v6, v1, v6

    add-int/2addr v6, v2

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 96
    const/16 v6, 0x7cc

    if-lt v4, v6, :cond_109

    .line 97
    const/16 v5, 0x4f

    .line 101
    .restart local v5    # "ld":I
    :goto_e1
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    if-le v6, v5, :cond_141

    .line 102
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    sub-int/2addr v6, v5

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 103
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    if-gt v6, v12, :cond_115

    .line 104
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1f

    packed-switch v6, :pswitch_data_1b8

    .line 110
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1f

    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 111
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1f

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 114
    :goto_103
    add-int/lit16 v6, v4, -0x26d

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    goto/16 :goto_68

    .line 99
    .end local v5    # "ld":I
    :cond_109
    const/16 v5, 0x50

    .restart local v5    # "ld":I
    goto :goto_e1

    .line 106
    :pswitch_10c
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1f

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 107
    iput v11, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    goto :goto_103

    .line 116
    :cond_115
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    add-int/lit16 v6, v6, -0xba

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 117
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    packed-switch v6, :pswitch_data_1be

    .line 123
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0x7

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 124
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 127
    :goto_130
    add-int/lit16 v6, v4, -0x26d

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    goto/16 :goto_68

    .line 119
    :pswitch_136
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0x6

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 120
    iput v8, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    goto :goto_130

    .line 130
    :cond_141
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    add-int/lit8 v6, v6, 0xa

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 131
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    packed-switch v6, :pswitch_data_1c4

    .line 137
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0xa

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 138
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    rem-int/lit8 v6, v6, 0x1e

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 141
    :goto_15c
    add-int/lit16 v6, v4, -0x26e

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    goto/16 :goto_68

    .line 133
    :pswitch_162
    iget v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    div-int/lit8 v6, v6, 0x1e

    add-int/lit8 v6, v6, 0x9

    iput v6, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 134
    iput v8, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    goto :goto_15c

    .line 43
    nop

    :array_16e
    .array-data 4
        0x0
        0x1f
        0x3b
        0x5a
        0x78
        0x97
        0xb5
        0xd4
        0xf3
        0x111
        0x130
        0x14e
    .end array-data

    .line 44
    :array_18a
    .array-data 4
        0x0
        0x1f
        0x3c
        0x5b
        0x79
        0x98
        0xb6
        0xd5
        0xf4
        0x112
        0x131
        0x14f
    .end array-data

    .line 50
    :pswitch_data_1a6
    .packed-switch 0x0
        :pswitch_69
    .end packed-switch

    .line 63
    :pswitch_data_1ac
    .packed-switch 0x0
        :pswitch_92
    .end packed-switch

    .line 82
    :pswitch_data_1b2
    .packed-switch 0x0
        :pswitch_c9
    .end packed-switch

    .line 104
    :pswitch_data_1b8
    .packed-switch 0x0
        :pswitch_10c
    .end packed-switch

    .line 117
    :pswitch_data_1be
    .packed-switch 0x0
        :pswitch_136
    .end packed-switch

    .line 131
    :pswitch_data_1c4
    .packed-switch 0x0
        :pswitch_162
    .end packed-switch
.end method


# virtual methods
.method public getDescribedDateFormat()Ljava/lang/String;
    .registers 4

    .prologue
    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .local v0, "describedDateFormat":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->getWeekDay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    .line 223
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 224
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 226
    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->getMonth()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    .line 227
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    .line 228
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u0647.\u0634 "

    .line 229
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u0633\u0627\u0639\u062a "

    .line 230
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 231
    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->getTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getMonth()Ljava/lang/String;
    .registers 3

    .prologue
    .line 177
    const-string v0, ""

    .line 178
    .local v0, "strMonth":Ljava/lang/String;
    iget v1, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    packed-switch v1, :pswitch_data_2c

    .line 216
    :goto_7
    return-object v0

    .line 180
    :pswitch_8
    const-string v0, "\u0641\u0631\u0648\u0631\u062f\u064a\u0646"

    .line 181
    goto :goto_7

    .line 183
    :pswitch_b
    const-string v0, "\u0627\u0631\u062f\u064a\u0628\u0647\u0634\u062a"

    .line 184
    goto :goto_7

    .line 186
    :pswitch_e
    const-string v0, "\u062e\u0631\u062f\u0627\u062f"

    .line 187
    goto :goto_7

    .line 189
    :pswitch_11
    const-string v0, "\u062a\u064a\u0631"

    .line 190
    goto :goto_7

    .line 192
    :pswitch_14
    const-string v0, "\u0645\u0631\u062f\u0627\u062f"

    .line 193
    goto :goto_7

    .line 195
    :pswitch_17
    const-string v0, "\u0634\u0647\u0631\u064a\u0648\u0631"

    .line 196
    goto :goto_7

    .line 198
    :pswitch_1a
    const-string v0, "\u0645\u0647\u0631"

    .line 199
    goto :goto_7

    .line 201
    :pswitch_1d
    const-string v0, "\u0622\u0628\u0627\u0646"

    .line 202
    goto :goto_7

    .line 204
    :pswitch_20
    const-string v0, "\u0622\u0630\u0631"

    .line 205
    goto :goto_7

    .line 207
    :pswitch_23
    const-string v0, "\u062f\u064a"

    .line 208
    goto :goto_7

    .line 210
    :pswitch_26
    const-string v0, "\u0628\u0647\u0645\u0646"

    .line 211
    goto :goto_7

    .line 213
    :pswitch_29
    const-string v0, "\u0627\u0633\u0641\u0646\u062f"

    goto :goto_7

    .line 178
    :pswitch_data_2c
    .packed-switch 0x1
        :pswitch_8
        :pswitch_b
        :pswitch_e
        :pswitch_11
        :pswitch_14
        :pswitch_17
        :pswitch_1a
        :pswitch_1d
        :pswitch_20
        :pswitch_23
        :pswitch_26
        :pswitch_29
    .end packed-switch
.end method

.method public getNumericDateFormat()Ljava/lang/String;
    .registers 4

    .prologue
    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .local v0, "numericDateFormat":Ljava/lang/StringBuilder;
    iget v1, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->year:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    .line 239
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->month:I

    .line 240
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    .line 241
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->date:I

    .line 242
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    .line 243
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 244
    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->getTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getTime()Ljava/lang/String;
    .registers 9

    .prologue
    const/16 v7, 0xa

    .line 251
    iget-object v4, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    const/16 v5, 0xb

    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 252
    .local v0, "h":I
    iget-object v4, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    const/16 v5, 0xc

    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 253
    .local v1, "m":I
    iget-object v4, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    const/16 v5, 0xd

    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 254
    .local v2, "s":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .local v3, "time":Ljava/lang/StringBuilder;
    if-ge v0, v7, :cond_7a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "0"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ":"

    .line 256
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    if-ge v1, v7, :cond_7f

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "0"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 257
    :goto_53
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ":"

    .line 258
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    if-ge v2, v7, :cond_84

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "0"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 259
    :goto_72
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 260
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    return-object v4

    .line 255
    :cond_7a
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_34

    .line 257
    :cond_7f
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_53

    .line 259
    :cond_84
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_72
.end method

.method public getTimeInMillis()J
    .registers 3

    .prologue
    .line 265
    iget-object v0, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->calendar:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public getWeekDay()Ljava/lang/String;
    .registers 3

    .prologue
    .line 148
    const-string v0, ""

    .line 149
    .local v0, "strWeekDay":Ljava/lang/String;
    iget v1, p0, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->weekDay:I

    packed-switch v1, :pswitch_data_1e

    .line 172
    :goto_7
    return-object v0

    .line 151
    :pswitch_8
    const-string v0, "\u064a\u06a9\u0634\u0646\u0628\u0647"

    .line 152
    goto :goto_7

    .line 154
    :pswitch_b
    const-string v0, "\u062f\u0648\u0634\u0646\u0628\u0647"

    .line 155
    goto :goto_7

    .line 157
    :pswitch_e
    const-string v0, "\u0633\u0647 \u0634\u0646\u0628\u0647"

    .line 158
    goto :goto_7

    .line 160
    :pswitch_11
    const-string v0, "\u0686\u0647\u0627\u0631\u0634\u0646\u0628\u0647"

    .line 161
    goto :goto_7

    .line 163
    :pswitch_14
    const-string v0, "\u067e\u0646\u062c \u0634\u0646\u0628\u0647"

    .line 164
    goto :goto_7

    .line 166
    :pswitch_17
    const-string v0, "\u062c\u0645\u0639\u0647"

    .line 167
    goto :goto_7

    .line 169
    :pswitch_1a
    const-string v0, "\u0634\u0646\u0628\u0647"

    goto :goto_7

    .line 149
    nop

    :pswitch_data_1e
    .packed-switch 0x0
        :pswitch_8
        :pswitch_b
        :pswitch_e
        :pswitch_11
        :pswitch_14
        :pswitch_17
        :pswitch_1a
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    .prologue
    .line 271
    invoke-virtual {p0}, Lorg/pouyadr/Pouya/Helper/SolarCalendar;->getDescribedDateFormat()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
