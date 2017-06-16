.class public Lorg/pouyadr/Pouya/utils/TimeAgo;
.super Ljava/lang/Object;
.source "TimeAgo.java"


# static fields
.field protected static context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    sput-object p1, Lorg/pouyadr/Pouya/utils/TimeAgo;->context:Landroid/content/Context;

    .line 36
    return-void
.end method

.method public static FastGet(Ljava/lang/String;)Ljava/lang/String;
    .registers 7
    .param p0, "Dates"    # Ljava/lang/String;

    .prologue
    .line 22
    new-instance v3, Lorg/pouyadr/Pouya/utils/TimeAgo;

    sget-object v5, Lorg/pouyadr/ui/LaunchActivity;->thiscontext:Landroid/content/Context;

    invoke-direct {v3, v5}, Lorg/pouyadr/Pouya/utils/TimeAgo;-><init>(Landroid/content/Context;)V

    .line 23
    .local v3, "s":Lorg/pouyadr/Pouya/utils/TimeAgo;
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v5, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v1, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 24
    .local v1, "dateFormat":Ljava/text/SimpleDateFormat;
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 26
    .local v0, "convertedDate":Ljava/util/Date;
    :try_start_13
    invoke-virtual {v1, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_16
    .catch Ljava/text/ParseException; {:try_start_13 .. :try_end_16} :catch_1c

    move-result-object v0

    .line 31
    :goto_17
    invoke-virtual {v3, v0}, Lorg/pouyadr/Pouya/utils/TimeAgo;->timeAgo(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 32
    .local v4, "timeago":Ljava/lang/String;
    return-object v4

    .line 27
    .end local v4    # "timeago":Ljava/lang/String;
    :catch_1c
    move-exception v2

    .line 29
    .local v2, "e":Ljava/text/ParseException;
    invoke-virtual {v2}, Ljava/text/ParseException;->printStackTrace()V

    goto :goto_17
.end method

.method public static timeAgo(J)Ljava/lang/String;
    .registers 30
    .param p0, "millis"    # J

    .prologue
    .line 43
    new-instance v19, Ljava/util/Date;

    invoke-direct/range {v19 .. v19}, Ljava/util/Date;-><init>()V

    invoke-virtual/range {v19 .. v19}, Ljava/util/Date;->getTime()J

    move-result-wide v22

    sub-long v6, v22, p0

    .line 44
    .local v6, "diff":J
    sget-object v19, Lorg/pouyadr/Pouya/utils/TimeAgo;->context:Landroid/content/Context;

    if-nez v19, :cond_13

    sget-object v19, Lorg/pouyadr/ui/LaunchActivity;->thiscontext:Landroid/content/Context;

    sput-object v19, Lorg/pouyadr/Pouya/utils/TimeAgo;->context:Landroid/content/Context;

    .line 45
    :cond_13
    sget-object v19, Lorg/pouyadr/Pouya/utils/TimeAgo;->context:Landroid/content/Context;

    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    .line 47
    .local v13, "r":Landroid/content/res/Resources;
    const v19, 0x7f080447

    move/from16 v0, v19

    invoke-virtual {v13, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 48
    .local v12, "prefix":Ljava/lang/String;
    const v19, 0x7f080449

    move/from16 v0, v19

    invoke-virtual {v13, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 50
    .local v15, "suffix":Ljava/lang/String;
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    move-result-wide v22

    const-wide/16 v24, 0x3e8

    div-long v22, v22, v24

    move-wide/from16 v0, v22

    long-to-double v0, v0

    move-wide/from16 v16, v0

    .line 51
    .local v16, "seconds":D
    const-wide/high16 v22, 0x404e000000000000L    # 60.0

    div-double v10, v16, v22

    .line 52
    .local v10, "minutes":D
    const-wide/high16 v22, 0x404e000000000000L    # 60.0

    div-double v8, v10, v22

    .line 53
    .local v8, "hours":D
    const-wide/high16 v22, 0x4038000000000000L    # 24.0

    div-double v4, v8, v22

    .line 54
    .local v4, "days":D
    const-wide v22, 0x4076d00000000000L    # 365.0

    div-double v20, v4, v22

    .line 58
    .local v20, "years":D
    const-wide v22, 0x4046800000000000L    # 45.0

    cmpg-double v19, v16, v22

    if-gez v19, :cond_b5

    .line 59
    const v19, 0x7f080448

    const/16 v22, 0x1

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->round(D)J

    move-result-wide v24

    move-wide/from16 v0, v24

    long-to-int v0, v0

    move/from16 v24, v0

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    aput-object v24, v22, v23

    move/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .line 87
    .local v18, "words":Ljava/lang/String;
    :goto_78
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .local v14, "sb":Ljava/lang/StringBuilder;
    if-eqz v12, :cond_92

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v19

    if-lez v19, :cond_92

    .line 90
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v22, " "

    move-object/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    :cond_92
    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    if-eqz v15, :cond_ac

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v19

    if-lez v19, :cond_ac

    .line 96
    const-string v19, " "

    move-object/from16 v0, v19

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    :cond_ac
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v19

    return-object v19

    .line 60
    .end local v14    # "sb":Ljava/lang/StringBuilder;
    .end local v18    # "words":Ljava/lang/String;
    :cond_b5
    const-wide v22, 0x4056800000000000L    # 90.0

    cmpg-double v19, v16, v22

    if-gez v19, :cond_dc

    .line 61
    const v19, 0x7f080445

    const/16 v22, 0x1

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    aput-object v24, v22, v23

    move/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto :goto_78

    .line 62
    .end local v18    # "words":Ljava/lang/String;
    :cond_dc
    const-wide v22, 0x4046800000000000L    # 45.0

    cmpg-double v19, v10, v22

    if-gez v19, :cond_116

    .line 63
    const v19, 0x7f090002

    .line 64
    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    move-result-wide v22

    move-wide/from16 v0, v22

    long-to-int v0, v0

    move/from16 v22, v0

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    move-result-wide v26

    move-wide/from16 v0, v26

    long-to-int v0, v0

    move/from16 v25, v0

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    aput-object v25, v23, v24

    .line 63
    move/from16 v0, v19

    move/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 65
    .end local v18    # "words":Ljava/lang/String;
    :cond_116
    const-wide v22, 0x4056800000000000L    # 90.0

    cmpg-double v19, v10, v22

    if-gez v19, :cond_13e

    .line 66
    const v19, 0x7f080444

    const/16 v22, 0x1

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    aput-object v24, v22, v23

    move/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 67
    .end local v18    # "words":Ljava/lang/String;
    :cond_13e
    const-wide/high16 v22, 0x4038000000000000L    # 24.0

    cmpg-double v19, v8, v22

    if-gez v19, :cond_175

    .line 68
    const v19, 0x7f090001

    .line 69
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v22

    move-wide/from16 v0, v22

    long-to-int v0, v0

    move/from16 v22, v0

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v26

    move-wide/from16 v0, v26

    long-to-int v0, v0

    move/from16 v25, v0

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    aput-object v25, v23, v24

    .line 68
    move/from16 v0, v19

    move/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 70
    .end local v18    # "words":Ljava/lang/String;
    :cond_175
    const-wide/high16 v22, 0x4045000000000000L    # 42.0

    cmpg-double v19, v8, v22

    if-gez v19, :cond_19a

    .line 71
    const v19, 0x7f080443

    const/16 v22, 0x1

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    aput-object v24, v22, v23

    move/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 72
    .end local v18    # "words":Ljava/lang/String;
    :cond_19a
    const-wide/high16 v22, 0x403e000000000000L    # 30.0

    cmpg-double v19, v4, v22

    if-gez v19, :cond_1d0

    .line 73
    const/high16 v19, 0x7f090000

    .line 74
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v22

    move-wide/from16 v0, v22

    long-to-int v0, v0

    move/from16 v22, v0

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v26

    move-wide/from16 v0, v26

    long-to-int v0, v0

    move/from16 v25, v0

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    aput-object v25, v23, v24

    .line 73
    move/from16 v0, v19

    move/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 75
    .end local v18    # "words":Ljava/lang/String;
    :cond_1d0
    const-wide v22, 0x4046800000000000L    # 45.0

    cmpg-double v19, v4, v22

    if-gez v19, :cond_1f8

    .line 76
    const v19, 0x7f080446

    const/16 v22, 0x1

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    aput-object v24, v22, v23

    move/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 77
    .end local v18    # "words":Ljava/lang/String;
    :cond_1f8
    const-wide v22, 0x4076d00000000000L    # 365.0

    cmpg-double v19, v4, v22

    if-gez v19, :cond_23a

    .line 78
    const v19, 0x7f090003

    const-wide/high16 v22, 0x403e000000000000L    # 30.0

    div-double v22, v4, v22

    .line 79
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->round(D)J

    move-result-wide v22

    move-wide/from16 v0, v22

    long-to-int v0, v0

    move/from16 v22, v0

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    const-wide/high16 v26, 0x403e000000000000L    # 30.0

    div-double v26, v4, v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->round(D)J

    move-result-wide v26

    move-wide/from16 v0, v26

    long-to-int v0, v0

    move/from16 v25, v0

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    aput-object v25, v23, v24

    .line 78
    move/from16 v0, v19

    move/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 80
    .end local v18    # "words":Ljava/lang/String;
    :cond_23a
    const-wide/high16 v22, 0x3ff8000000000000L    # 1.5

    cmpg-double v19, v20, v22

    if-gez v19, :cond_25f

    .line 81
    const v19, 0x7f08044a

    const/16 v22, 0x1

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    aput-object v24, v22, v23

    move/from16 v0, v19

    move-object/from16 v1, v22

    invoke-virtual {v13, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78

    .line 83
    .end local v18    # "words":Ljava/lang/String;
    :cond_25f
    const v19, 0x7f090004

    .line 84
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->round(D)J

    move-result-wide v22

    move-wide/from16 v0, v22

    long-to-int v0, v0

    move/from16 v22, v0

    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->round(D)J

    move-result-wide v26

    move-wide/from16 v0, v26

    long-to-int v0, v0

    move/from16 v25, v0

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    aput-object v25, v23, v24

    .line 83
    move/from16 v0, v19

    move/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    .restart local v18    # "words":Ljava/lang/String;
    goto/16 :goto_78
.end method


# virtual methods
.method public timeAgo(Ljava/util/Date;)Ljava/lang/String;
    .registers 4
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    .line 39
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lorg/pouyadr/Pouya/utils/TimeAgo;->timeAgo(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
