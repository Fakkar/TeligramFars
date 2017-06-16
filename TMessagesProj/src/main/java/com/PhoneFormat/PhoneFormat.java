.class public Lorg/pouyadr/PhoneFormat/PhoneFormat;
.super Ljava/lang/Object;
.source "PhoneFormat.java"


# static fields
.field private static volatile Instance:Lorg/pouyadr/PhoneFormat/PhoneFormat;


# instance fields
.field public buffer:Ljava/nio/ByteBuffer;

.field public callingCodeCountries:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public callingCodeData:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/pouyadr/PhoneFormat/CallingCodeInfo;",
            ">;"
        }
    .end annotation
.end field

.field public callingCodeOffsets:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public countryCallingCode:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public data:[B

.field public defaultCallingCode:Ljava/lang/String;

.field public defaultCountry:Ljava/lang/String;

.field private initialzed:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 49
    const/4 v0, 0x0

    sput-object v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->Instance:Lorg/pouyadr/PhoneFormat/PhoneFormat;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .prologue
    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->initialzed:Z

    .line 93
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->init(Ljava/lang/String;)V

    .line 94
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3
    .param p1, "countryCode"    # Ljava/lang/String;

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->initialzed:Z

    .line 97
    invoke-virtual {p0, p1}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->init(Ljava/lang/String;)V

    .line 98
    return-void
.end method

.method public static getInstance()Lorg/pouyadr/PhoneFormat/PhoneFormat;
    .registers 4

    .prologue
    .line 51
    sget-object v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->Instance:Lorg/pouyadr/PhoneFormat/PhoneFormat;

    .line 52
    .local v0, "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    if-nez v0, :cond_14

    .line 53
    const-class v3, Lorg/pouyadr/PhoneFormat/PhoneFormat;

    monitor-enter v3

    .line 54
    :try_start_7
    sget-object v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->Instance:Lorg/pouyadr/PhoneFormat/PhoneFormat;

    .line 55
    if-nez v0, :cond_13

    .line 56
    new-instance v1, Lorg/pouyadr/PhoneFormat/PhoneFormat;

    invoke-direct {v1}, Lorg/pouyadr/PhoneFormat/PhoneFormat;-><init>()V
    :try_end_10
    .catchall {:try_start_7 .. :try_end_10} :catchall_15

    .end local v0    # "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    .local v1, "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    :try_start_10
    sput-object v1, Lorg/pouyadr/PhoneFormat/PhoneFormat;->Instance:Lorg/pouyadr/PhoneFormat/PhoneFormat;
    :try_end_12
    .catchall {:try_start_10 .. :try_end_12} :catchall_18

    move-object v0, v1

    .line 58
    .end local v1    # "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    .restart local v0    # "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    :cond_13
    :try_start_13
    monitor-exit v3

    .line 60
    :cond_14
    return-object v0

    .line 58
    :catchall_15
    move-exception v2

    :goto_16
    monitor-exit v3
    :try_end_17
    .catchall {:try_start_13 .. :try_end_17} :catchall_15

    throw v2

    .end local v0    # "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    .restart local v1    # "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    :catchall_18
    move-exception v2

    move-object v0, v1

    .end local v1    # "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    .restart local v0    # "localInstance":Lorg/pouyadr/PhoneFormat/PhoneFormat;
    goto :goto_16
.end method

.method public static strip(Ljava/lang/String;)Ljava/lang/String;
    .registers 5
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .local v2, "res":Ljava/lang/StringBuilder;
    const-string v1, "0123456789+*#"

    .line 66
    .local v1, "phoneChars":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v0, v3, -0x1

    .local v0, "i":I
    :goto_d
    if-ltz v0, :cond_21

    .line 67
    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1e

    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 66
    :cond_1e
    add-int/lit8 v0, v0, -0x1

    goto :goto_d

    .line 71
    :cond_21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public static stripExceptNumbers(Ljava/lang/String;)Ljava/lang/String;
    .registers 2
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 89
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->stripExceptNumbers(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static stripExceptNumbers(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 7
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "includePlus"    # Z

    .prologue
    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .local v2, "res":Ljava/lang/StringBuilder;
    const-string v1, "0123456789"

    .line 77
    .local v1, "phoneChars":Ljava/lang/String;
    if-eqz p1, :cond_1c

    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "+"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 80
    :cond_1c
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v0, v3, -0x1

    .local v0, "i":I
    :goto_22
    if-ltz v0, :cond_36

    .line 81
    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_33

    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 80
    :cond_33
    add-int/lit8 v0, v0, -0x1

    goto :goto_22

    .line 85
    :cond_36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method


# virtual methods
.method public callingCodeForCountryCode(Ljava/lang/String;)Ljava/lang/String;
    .registers 4
    .param p1, "countryCode"    # Ljava/lang/String;

    .prologue
    .line 154
    iget-object v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->countryCallingCode:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public callingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    .registers 30
    .param p1, "callingCode"    # Ljava/lang/String;

    .prologue
    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeData:Ljava/util/HashMap;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    .line 296
    .local v11, "res":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    if-nez v11, :cond_1db

    .line 297
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeOffsets:Ljava/util/HashMap;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    .line 298
    .local v6, "num":Ljava/lang/Integer;
    if-eqz v6, :cond_1db

    .line 299
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    .line 300
    .local v4, "bytes":[B
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v19

    .line 301
    .local v19, "start":I
    move/from16 v7, v19

    .line 302
    .local v7, "offset":I
    new-instance v11, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    .end local v11    # "res":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    invoke-direct {v11}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;-><init>()V

    .line 303
    .restart local v11    # "res":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    move-object/from16 v0, p1

    iput-object v0, v11, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->callingCode:Ljava/lang/String;

    .line 304
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeCountries:Ljava/util/HashMap;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ljava/util/ArrayList;

    move-object/from16 v0, v23

    iput-object v0, v11, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->countries:Ljava/util/ArrayList;

    .line 305
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeData:Ljava/util/HashMap;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value16(I)S

    move-result v2

    .line 308
    .local v2, "block1Len":I
    add-int/lit8 v7, v7, 0x2

    .line 310
    add-int/lit8 v7, v7, 0x2

    .line 311
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value16(I)S

    move-result v3

    .line 312
    .local v3, "block2Len":I
    add-int/lit8 v7, v7, 0x2

    .line 314
    add-int/lit8 v7, v7, 0x2

    .line 315
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value16(I)S

    move-result v18

    .line 316
    .local v18, "setCnt":I
    add-int/lit8 v7, v7, 0x2

    .line 318
    add-int/lit8 v7, v7, 0x2

    .line 320
    new-instance v22, Ljava/util/ArrayList;

    const/16 v23, 0x5

    invoke-direct/range {v22 .. v23}, Ljava/util/ArrayList;-><init>(I)V

    .line 322
    .local v22, "strs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :goto_7d
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->valueString(I)Ljava/lang/String;

    move-result-object v20

    .local v20, "str":Ljava/lang/String;
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v23

    if-eqz v23, :cond_99

    .line 323
    move-object/from16 v0, v22

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v23

    add-int/lit8 v23, v23, 0x1

    add-int v7, v7, v23

    goto :goto_7d

    .line 326
    :cond_99
    move-object/from16 v0, v22

    iput-object v0, v11, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->trunkPrefixes:Ljava/util/ArrayList;

    .line 327
    add-int/lit8 v7, v7, 0x1

    .line 329
    new-instance v22, Ljava/util/ArrayList;

    .end local v22    # "strs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/16 v23, 0x5

    invoke-direct/range {v22 .. v23}, Ljava/util/ArrayList;-><init>(I)V

    .line 330
    .restart local v22    # "strs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :goto_a6
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->valueString(I)Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v23

    if-eqz v23, :cond_c2

    .line 331
    move-object/from16 v0, v22

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v23

    add-int/lit8 v23, v23, 0x1

    add-int v7, v7, v23

    goto :goto_a6

    .line 334
    :cond_c2
    move-object/from16 v0, v22

    iput-object v0, v11, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->intlPrefixes:Ljava/util/ArrayList;

    .line 336
    new-instance v15, Ljava/util/ArrayList;

    move/from16 v0, v18

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 337
    .local v15, "ruleSets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/PhoneFormat/RuleSet;>;"
    add-int v7, v19, v2

    .line 338
    const/16 v17, 0x0

    .local v17, "s":I
    :goto_d1
    move/from16 v0, v17

    move/from16 v1, v18

    if-ge v0, v1, :cond_1d9

    .line 339
    new-instance v14, Lorg/pouyadr/PhoneFormat/RuleSet;

    invoke-direct {v14}, Lorg/pouyadr/PhoneFormat/RuleSet;-><init>()V

    .line 340
    .local v14, "ruleSet":Lorg/pouyadr/PhoneFormat/RuleSet;
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value16(I)S

    move-result v23

    move/from16 v0, v23

    iput v0, v14, Lorg/pouyadr/PhoneFormat/RuleSet;->matchLen:I

    .line 341
    add-int/lit8 v7, v7, 0x2

    .line 342
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value16(I)S

    move-result v13

    .line 343
    .local v13, "ruleCnt":I
    add-int/lit8 v7, v7, 0x2

    .line 344
    new-instance v16, Ljava/util/ArrayList;

    move-object/from16 v0, v16

    invoke-direct {v0, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 345
    .local v16, "rules":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/PhoneFormat/PhoneRule;>;"
    const/4 v10, 0x0

    .local v10, "r":I
    :goto_f8
    if-ge v10, v13, :cond_1ce

    .line 346
    new-instance v12, Lorg/pouyadr/PhoneFormat/PhoneRule;

    invoke-direct {v12}, Lorg/pouyadr/PhoneFormat/PhoneRule;-><init>()V

    .line 347
    .local v12, "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value32(I)I

    move-result v23

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->minVal:I

    .line 348
    add-int/lit8 v7, v7, 0x4

    .line 349
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value32(I)I

    move-result v23

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxVal:I

    .line 350
    add-int/lit8 v7, v7, 0x4

    .line 351
    add-int/lit8 v8, v7, 0x1

    .end local v7    # "offset":I
    .local v8, "offset":I
    aget-byte v23, v4, v7

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->byte8:I

    .line 352
    add-int/lit8 v7, v8, 0x1

    .end local v8    # "offset":I
    .restart local v7    # "offset":I
    aget-byte v23, v4, v8

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxLen:I

    .line 353
    add-int/lit8 v8, v7, 0x1

    .end local v7    # "offset":I
    .restart local v8    # "offset":I
    aget-byte v23, v4, v7

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->otherFlag:I

    .line 354
    add-int/lit8 v7, v8, 0x1

    .end local v8    # "offset":I
    .restart local v7    # "offset":I
    aget-byte v23, v4, v8

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->prefixLen:I

    .line 355
    add-int/lit8 v8, v7, 0x1

    .end local v7    # "offset":I
    .restart local v8    # "offset":I
    aget-byte v23, v4, v7

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    .line 356
    add-int/lit8 v7, v8, 0x1

    .end local v8    # "offset":I
    .restart local v7    # "offset":I
    aget-byte v23, v4, v8

    move/from16 v0, v23

    iput v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag13:I

    .line 357
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value16(I)S

    move-result v21

    .line 358
    .local v21, "strOffset":I
    add-int/lit8 v7, v7, 0x2

    .line 359
    add-int v23, v19, v2

    add-int v23, v23, v3

    add-int v23, v23, v21

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->valueString(I)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v23

    iput-object v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    .line 361
    iget-object v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    move-object/from16 v23, v0

    const-string v24, "[["

    invoke-virtual/range {v23 .. v24}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    .line 362
    .local v9, "openPos":I
    const/16 v23, -0x1

    move/from16 v0, v23

    if-eq v9, v0, :cond_1ad

    .line 363
    iget-object v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    move-object/from16 v23, v0

    const-string v24, "]]"

    invoke-virtual/range {v23 .. v24}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 364
    .local v5, "closePos":I
    const-string v23, "%s%s"

    const/16 v24, 0x2

    move/from16 v0, v24

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    iget-object v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    move-object/from16 v0, v26

    move/from16 v1, v27

    invoke-virtual {v0, v1, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v26

    aput-object v26, v24, v25

    const/16 v25, 0x1

    iget-object v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    move-object/from16 v26, v0

    add-int/lit8 v27, v5, 0x2

    invoke-virtual/range {v26 .. v27}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v26

    aput-object v26, v24, v25

    invoke-static/range {v23 .. v24}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, v23

    iput-object v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    .line 367
    .end local v5    # "closePos":I
    :cond_1ad
    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    iget-boolean v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->hasIntlPrefix:Z

    move/from16 v23, v0

    if-eqz v23, :cond_1be

    .line 370
    const/16 v23, 0x1

    move/from16 v0, v23

    iput-boolean v0, v14, Lorg/pouyadr/PhoneFormat/RuleSet;->hasRuleWithIntlPrefix:Z

    .line 372
    :cond_1be
    iget-boolean v0, v12, Lorg/pouyadr/PhoneFormat/PhoneRule;->hasTrunkPrefix:Z

    move/from16 v23, v0

    if-eqz v23, :cond_1ca

    .line 373
    const/16 v23, 0x1

    move/from16 v0, v23

    iput-boolean v0, v14, Lorg/pouyadr/PhoneFormat/RuleSet;->hasRuleWithTrunkPrefix:Z

    .line 345
    :cond_1ca
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_f8

    .line 376
    .end local v9    # "openPos":I
    .end local v12    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    .end local v21    # "strOffset":I
    :cond_1ce
    move-object/from16 v0, v16

    iput-object v0, v14, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    .line 377
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    add-int/lit8 v17, v17, 0x1

    goto/16 :goto_d1

    .line 379
    .end local v10    # "r":I
    .end local v13    # "ruleCnt":I
    .end local v14    # "ruleSet":Lorg/pouyadr/PhoneFormat/RuleSet;
    .end local v16    # "rules":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/PhoneFormat/PhoneRule;>;"
    :cond_1d9
    iput-object v15, v11, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->ruleSets:Ljava/util/ArrayList;

    .line 383
    .end local v2    # "block1Len":I
    .end local v3    # "block2Len":I
    .end local v4    # "bytes":[B
    .end local v6    # "num":Ljava/lang/Integer;
    .end local v7    # "offset":I
    .end local v15    # "ruleSets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/PhoneFormat/RuleSet;>;"
    .end local v17    # "s":I
    .end local v18    # "setCnt":I
    .end local v19    # "start":I
    .end local v20    # "str":Ljava/lang/String;
    .end local v22    # "strs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1db
    return-object v11
.end method

.method public countriesForCallingCode(Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 3
    .param p1, "callingCode"    # Ljava/lang/String;

    .prologue
    .line 158
    const-string v0, "+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 159
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 162
    :cond_d
    iget-object v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeCountries:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public defaultCallingCode()Ljava/lang/String;
    .registers 2

    .prologue
    .line 150
    iget-object v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCountry:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeForCountryCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public findCallingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    .registers 6
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 166
    const/4 v1, 0x0

    .line 167
    .local v1, "res":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_2
    const/4 v2, 0x3

    if-ge v0, v2, :cond_18

    .line 168
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_18

    .line 169
    const/4 v2, 0x0

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    move-result-object v1

    .line 170
    if-eqz v1, :cond_19

    .line 178
    :cond_18
    return-object v1

    .line 167
    :cond_19
    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public format(Ljava/lang/String;)Ljava/lang/String;
    .registers 12
    .param p1, "orig"    # Ljava/lang/String;

    .prologue
    .line 182
    iget-boolean v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->initialzed:Z

    if-nez v7, :cond_5

    .line 223
    .end local p1    # "orig":Ljava/lang/String;
    :cond_4
    :goto_4
    return-object p1

    .line 186
    .restart local p1    # "orig":Ljava/lang/String;
    :cond_5
    :try_start_5
    invoke-static {p1}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->strip(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 188
    .local v6, "str":Ljava/lang/String;
    const-string v7, "+"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_34

    .line 189
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 190
    .local v5, "rest":Ljava/lang/String;
    invoke-virtual {p0, v5}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->findCallingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    move-result-object v2

    .line 191
    .local v2, "info":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    if-eqz v2, :cond_4

    .line 192
    invoke-virtual {v2, v5}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 193
    .local v4, "phone":Ljava/lang/String;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "+"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    .line 198
    .end local v2    # "info":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    .end local v4    # "phone":Ljava/lang/String;
    .end local v5    # "rest":Ljava/lang/String;
    :cond_34
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCallingCode:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    move-result-object v2

    .line 199
    .restart local v2    # "info":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    if-eqz v2, :cond_4

    .line 203
    invoke-virtual {v2, v6}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->matchingAccessCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 204
    .local v0, "accessCode":Ljava/lang/String;
    if-eqz v0, :cond_6d

    .line 205
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 206
    .restart local v5    # "rest":Ljava/lang/String;
    move-object v4, v5

    .line 207
    .restart local v4    # "phone":Ljava/lang/String;
    invoke-virtual {p0, v5}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->findCallingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    move-result-object v3

    .line 208
    .local v3, "info2":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    if-eqz v3, :cond_55

    .line 209
    invoke-virtual {v3, v5}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 212
    :cond_55
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_5d

    move-object p1, v0

    .line 213
    goto :goto_4

    .line 215
    :cond_5d
    const-string v7, "%s %s"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v9, 0x1

    aput-object v4, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    .line 218
    .end local v3    # "info2":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    .end local v4    # "phone":Ljava/lang/String;
    .end local v5    # "rest":Ljava/lang/String;
    :cond_6d
    invoke-virtual {v2, v6}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->format(Ljava/lang/String;)Ljava/lang/String;
    :try_end_70
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_70} :catch_72

    move-result-object p1

    goto :goto_4

    .line 221
    .end local v0    # "accessCode":Ljava/lang/String;
    .end local v2    # "info":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    .end local v6    # "str":Ljava/lang/String;
    :catch_72
    move-exception v1

    .line 222
    .local v1, "e":Ljava/lang/Exception;
    const-string v7, "tmessages"

    invoke-static {v7, v1}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4
.end method

.method public init(Ljava/lang/String;)V
    .registers 12
    .param p1, "countryCode"    # Ljava/lang/String;

    .prologue
    const/16 v9, 0xff

    .line 101
    const/4 v6, 0x0

    .line 102
    .local v6, "stream":Ljava/io/InputStream;
    const/4 v0, 0x0

    .line 104
    .local v0, "bos":Ljava/io/ByteArrayOutputStream;
    :try_start_4
    sget-object v7, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v7

    const-string v8, "PhoneFormats.dat"

    invoke-virtual {v7, v8}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v6

    .line 105
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_15} :catch_cf
    .catchall {:try_start_4 .. :try_end_15} :catchall_a3

    .line 106
    .end local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    .local v1, "bos":Ljava/io/ByteArrayOutputStream;
    const/16 v7, 0x400

    :try_start_17
    new-array v2, v7, [B

    .line 108
    .local v2, "buf":[B
    :goto_19
    const/4 v7, 0x0

    const/16 v8, 0x400

    invoke-virtual {v6, v2, v7, v8}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    .local v4, "len":I
    const/4 v7, -0x1

    if-eq v4, v7, :cond_38

    .line 109
    const/4 v7, 0x0

    invoke-virtual {v1, v2, v7, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_27} :catch_28
    .catchall {:try_start_17 .. :try_end_27} :catchall_cc

    goto :goto_19

    .line 114
    .end local v2    # "buf":[B
    .end local v4    # "len":I
    :catch_28
    move-exception v3

    move-object v0, v1

    .line 115
    .end local v1    # "bos":Ljava/io/ByteArrayOutputStream;
    .restart local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    .local v3, "e":Ljava/lang/Exception;
    :goto_2a
    :try_start_2a
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2d
    .catchall {:try_start_2a .. :try_end_2d} :catchall_a3

    .line 119
    if-eqz v0, :cond_32

    .line 120
    :try_start_2f
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_32} :catch_95

    .line 126
    :cond_32
    :goto_32
    if-eqz v6, :cond_37

    .line 127
    :try_start_34
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_37} :catch_9c

    .line 147
    .end local v3    # "e":Ljava/lang/Exception;
    :cond_37
    :goto_37
    return-void

    .line 111
    .end local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    .restart local v1    # "bos":Ljava/io/ByteArrayOutputStream;
    .restart local v2    # "buf":[B
    .restart local v4    # "len":I
    :cond_38
    :try_start_38
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    iput-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    .line 112
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    invoke-static {v7}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v7

    iput-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->buffer:Ljava/nio/ByteBuffer;

    .line 113
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->buffer:Ljava/nio/ByteBuffer;

    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_4d
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_4d} :catch_28
    .catchall {:try_start_38 .. :try_end_4d} :catchall_cc

    .line 119
    if-eqz v1, :cond_52

    .line 120
    :try_start_4f
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_52
    .catch Ljava/lang/Exception; {:try_start_4f .. :try_end_52} :catch_87

    .line 126
    :cond_52
    :goto_52
    if-eqz v6, :cond_57

    .line 127
    :try_start_54
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_54 .. :try_end_57} :catch_8e

    .line 134
    :cond_57
    :goto_57
    if-eqz p1, :cond_bd

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_bd

    .line 135
    iput-object p1, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCountry:Ljava/lang/String;

    .line 140
    :goto_61
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(I)V

    iput-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeOffsets:Ljava/util/HashMap;

    .line 141
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(I)V

    iput-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeCountries:Ljava/util/HashMap;

    .line 142
    new-instance v7, Ljava/util/HashMap;

    const/16 v8, 0xa

    invoke-direct {v7, v8}, Ljava/util/HashMap;-><init>(I)V

    iput-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeData:Ljava/util/HashMap;

    .line 143
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(I)V

    iput-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->countryCallingCode:Ljava/util/HashMap;

    .line 145
    invoke-virtual {p0}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->parseDataHeader()V

    .line 146
    const/4 v7, 0x1

    iput-boolean v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->initialzed:Z

    move-object v0, v1

    .line 147
    .end local v1    # "bos":Ljava/io/ByteArrayOutputStream;
    .restart local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    goto :goto_37

    .line 122
    .end local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    .restart local v1    # "bos":Ljava/io/ByteArrayOutputStream;
    :catch_87
    move-exception v3

    .line 123
    .restart local v3    # "e":Ljava/lang/Exception;
    const-string v7, "tmessages"

    invoke-static {v7, v3}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_52

    .line 129
    .end local v3    # "e":Ljava/lang/Exception;
    :catch_8e
    move-exception v3

    .line 130
    .restart local v3    # "e":Ljava/lang/Exception;
    const-string v7, "tmessages"

    invoke-static {v7, v3}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_57

    .line 122
    .end local v1    # "bos":Ljava/io/ByteArrayOutputStream;
    .end local v2    # "buf":[B
    .end local v4    # "len":I
    .restart local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    :catch_95
    move-exception v3

    .line 123
    const-string v7, "tmessages"

    invoke-static {v7, v3}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_32

    .line 129
    :catch_9c
    move-exception v3

    .line 130
    const-string v7, "tmessages"

    invoke-static {v7, v3}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_37

    .line 118
    .end local v3    # "e":Ljava/lang/Exception;
    :catchall_a3
    move-exception v7

    .line 119
    :goto_a4
    if-eqz v0, :cond_a9

    .line 120
    :try_start_a6
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a9
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_a9} :catch_af

    .line 126
    :cond_a9
    :goto_a9
    if-eqz v6, :cond_ae

    .line 127
    :try_start_ab
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_ae
    .catch Ljava/lang/Exception; {:try_start_ab .. :try_end_ae} :catch_b6

    .line 131
    :cond_ae
    :goto_ae
    throw v7

    .line 122
    :catch_af
    move-exception v3

    .line 123
    .restart local v3    # "e":Ljava/lang/Exception;
    const-string v8, "tmessages"

    invoke-static {v8, v3}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a9

    .line 129
    .end local v3    # "e":Ljava/lang/Exception;
    :catch_b6
    move-exception v3

    .line 130
    .restart local v3    # "e":Ljava/lang/Exception;
    const-string v8, "tmessages"

    invoke-static {v8, v3}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_ae

    .line 137
    .end local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    .end local v3    # "e":Ljava/lang/Exception;
    .restart local v1    # "bos":Ljava/io/ByteArrayOutputStream;
    .restart local v2    # "buf":[B
    .restart local v4    # "len":I
    :cond_bd
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    .line 138
    .local v5, "loc":Ljava/util/Locale;
    invoke-virtual {v5}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCountry:Ljava/lang/String;

    goto :goto_61

    .line 118
    .end local v2    # "buf":[B
    .end local v4    # "len":I
    .end local v5    # "loc":Ljava/util/Locale;
    :catchall_cc
    move-exception v7

    move-object v0, v1

    .end local v1    # "bos":Ljava/io/ByteArrayOutputStream;
    .restart local v0    # "bos":Ljava/io/ByteArrayOutputStream;
    goto :goto_a4

    .line 114
    :catch_cf
    move-exception v3

    goto/16 :goto_2a
.end method

.method public isPhoneNumberValid(Ljava/lang/String;)Z
    .registers 10
    .param p1, "phoneNumber"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 229
    iget-boolean v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->initialzed:Z

    if-nez v7, :cond_7

    .line 254
    :cond_6
    :goto_6
    return v5

    .line 232
    :cond_7
    invoke-static {p1}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->strip(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 234
    .local v4, "str":Ljava/lang/String;
    const-string v7, "+"

    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_25

    .line 235
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 236
    .local v3, "rest":Ljava/lang/String;
    invoke-virtual {p0, v3}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->findCallingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    move-result-object v1

    .line 237
    .local v1, "info":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    if-eqz v1, :cond_23

    invoke-virtual {v1, v3}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->isValidPhoneNumber(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_23
    move v5, v6

    goto :goto_6

    .line 239
    .end local v1    # "info":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    .end local v3    # "rest":Ljava/lang/String;
    :cond_25
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCallingCode:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    move-result-object v1

    .line 240
    .restart local v1    # "info":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    if-nez v1, :cond_2f

    move v5, v6

    .line 241
    goto :goto_6

    .line 244
    :cond_2f
    invoke-virtual {v1, v4}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->matchingAccessCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 245
    .local v0, "accessCode":Ljava/lang/String;
    if-eqz v0, :cond_53

    .line 246
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 247
    .restart local v3    # "rest":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_51

    .line 248
    invoke-virtual {p0, v3}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->findCallingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    move-result-object v2

    .line 249
    .local v2, "info2":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    if-eqz v2, :cond_4f

    invoke-virtual {v2, v3}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->isValidPhoneNumber(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_4f
    move v5, v6

    goto :goto_6

    .end local v2    # "info2":Lorg/pouyadr/PhoneFormat/CallingCodeInfo;
    :cond_51
    move v5, v6

    .line 251
    goto :goto_6

    .line 254
    .end local v3    # "rest":Ljava/lang/String;
    :cond_53
    invoke-virtual {v1, v4}, Lorg/pouyadr/PhoneFormat/CallingCodeInfo;->isValidPhoneNumber(Ljava/lang/String;)Z

    move-result v5

    goto :goto_6
.end method

.method public parseDataHeader()V
    .registers 11

    .prologue
    .line 387
    const/4 v8, 0x0

    invoke-virtual {p0, v8}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value32(I)I

    move-result v2

    .line 388
    .local v2, "count":I
    mul-int/lit8 v8, v2, 0xc

    add-int/lit8 v0, v8, 0x4

    .line 389
    .local v0, "base":I
    const/4 v7, 0x4

    .line 390
    .local v7, "spot":I
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_b
    if-ge v5, v2, :cond_53

    .line 391
    invoke-virtual {p0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->valueString(I)Ljava/lang/String;

    move-result-object v1

    .line 392
    .local v1, "callingCode":Ljava/lang/String;
    add-int/lit8 v7, v7, 0x4

    .line 393
    invoke-virtual {p0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->valueString(I)Ljava/lang/String;

    move-result-object v4

    .line 394
    .local v4, "country":Ljava/lang/String;
    add-int/lit8 v7, v7, 0x4

    .line 395
    invoke-virtual {p0, v7}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->value32(I)I

    move-result v8

    add-int v6, v8, v0

    .line 396
    .local v6, "offset":I
    add-int/lit8 v7, v7, 0x4

    .line 398
    iget-object v8, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCountry:Ljava/lang/String;

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2b

    .line 399
    iput-object v1, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCallingCode:Ljava/lang/String;

    .line 402
    :cond_2b
    iget-object v8, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->countryCallingCode:Ljava/util/HashMap;

    invoke-virtual {v8, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    iget-object v8, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeOffsets:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    iget-object v8, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeCountries:Ljava/util/HashMap;

    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 406
    .local v3, "countries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    if-nez v3, :cond_4d

    .line 407
    new-instance v3, Ljava/util/ArrayList;

    .end local v3    # "countries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 408
    .restart local v3    # "countries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    iget-object v8, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeCountries:Ljava/util/HashMap;

    invoke-virtual {v8, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    :cond_4d
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    .line 413
    .end local v1    # "callingCode":Ljava/lang/String;
    .end local v3    # "countries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v4    # "country":Ljava/lang/String;
    .end local v6    # "offset":I
    :cond_53
    iget-object v8, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCallingCode:Ljava/lang/String;

    if-eqz v8, :cond_5c

    .line 414
    iget-object v8, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->defaultCallingCode:Ljava/lang/String;

    invoke-virtual {p0, v8}, Lorg/pouyadr/PhoneFormat/PhoneFormat;->callingCodeInfo(Ljava/lang/String;)Lorg/pouyadr/PhoneFormat/CallingCodeInfo;

    .line 416
    :cond_5c
    return-void
.end method

.method value16(I)S
    .registers 4
    .param p1, "offset"    # I

    .prologue
    .line 269
    add-int/lit8 v0, p1, 0x2

    iget-object v1, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    array-length v1, v1

    if-gt v0, v1, :cond_13

    .line 270
    iget-object v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 271
    iget-object v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    .line 273
    :goto_12
    return v0

    :cond_13
    const/4 v0, 0x0

    goto :goto_12
.end method

.method value32(I)I
    .registers 4
    .param p1, "offset"    # I

    .prologue
    .line 260
    add-int/lit8 v0, p1, 0x4

    iget-object v1, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    array-length v1, v1

    if-gt v0, v1, :cond_13

    .line 261
    iget-object v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 262
    iget-object v0, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    .line 264
    :goto_12
    return v0

    :cond_13
    const/4 v0, 0x0

    goto :goto_12
.end method

.method public valueString(I)Ljava/lang/String;
    .registers 7
    .param p1, "offset"    # I

    .prologue
    .line 279
    move v0, p1

    .local v0, "a":I
    :goto_1
    :try_start_1
    iget-object v2, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    array-length v2, v2

    if-ge v0, v2, :cond_27

    .line 280
    iget-object v2, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    aget-byte v2, v2, v0

    if-nez v2, :cond_24

    .line 281
    sub-int v2, v0, p1

    if-ne p1, v2, :cond_13

    .line 282
    const-string v2, ""

    .line 290
    :goto_12
    return-object v2

    .line 284
    :cond_13
    new-instance v2, Ljava/lang/String;

    iget-object v3, p0, Lorg/pouyadr/PhoneFormat/PhoneFormat;->data:[B

    sub-int v4, v0, p1

    invoke-direct {v2, v3, p1, v4}, Ljava/lang/String;-><init>([BII)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1c} :catch_1d

    goto :goto_12

    .line 288
    :catch_1d
    move-exception v1

    .line 289
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 290
    const-string v2, ""

    goto :goto_12

    .line 279
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_24
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 287
    :cond_27
    :try_start_27
    const-string v2, ""
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_29} :catch_1d

    goto :goto_12
.end method
