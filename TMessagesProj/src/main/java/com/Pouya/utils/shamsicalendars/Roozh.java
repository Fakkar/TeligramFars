.class public Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;
.super Ljava/lang/Object;
.source "Roozh.java"


# instance fields
.field private day:I

.field private gD:I

.field private gM:I

.field private gY:I

.field private jD:I

.field private jM:I

.field private jY:I

.field private leap:I

.field private march:I

.field private month:I

.field private year:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private JD2JG(II)V
    .registers 7
    .param p1, "JD"    # I
    .param p2, "J1G0"    # I

    .prologue
    .line 60
    mul-int/lit8 v2, p1, 0x4

    const v3, 0x84e7d5f

    add-int v1, v2, v3

    .line 62
    .local v1, "j":I
    if-nez p2, :cond_1c

    .line 63
    mul-int/lit8 v2, p1, 0x4

    const v3, 0xaeb3908

    add-int/2addr v2, v3

    const v3, 0x23ab1

    div-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0x4

    mul-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v1

    add-int/lit16 v1, v2, -0xf44

    .line 66
    :cond_1c
    rem-int/lit16 v2, v1, 0x5b5

    div-int/lit8 v2, v2, 0x4

    mul-int/lit8 v2, v2, 0x5

    add-int/lit16 v0, v2, 0x134

    .line 67
    .local v0, "i":I
    rem-int/lit16 v2, v0, 0x99

    div-int/lit8 v2, v2, 0x5

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gD:I

    .line 68
    div-int/lit16 v2, v0, 0x99

    rem-int/lit8 v2, v2, 0xc

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gM:I

    .line 69
    div-int/lit16 v2, v1, 0x5b5

    const v3, 0x18704

    sub-int/2addr v2, v3

    iget v3, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gM:I

    rsub-int/lit8 v3, v3, 0x8

    div-int/lit8 v3, v3, 0x6

    add-int/2addr v2, v3

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    .line 70
    return-void
.end method

.method private JD2Jal(I)V
    .registers 8
    .param p1, "JDN"    # I

    .prologue
    const/4 v5, 0x0

    .line 79
    invoke-direct {p0, p1, v5}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JD2JG(II)V

    .line 81
    iget v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    add-int/lit16 v2, v2, -0x26d

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jY:I

    .line 82
    iget v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jY:I

    invoke-direct {p0, v2}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JalCal(I)V

    .line 84
    iget v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    const/4 v3, 0x3

    iget v4, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->march:I

    invoke-direct {p0, v2, v3, v4, v5}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JG2JD(IIII)I

    move-result v0

    .line 85
    .local v0, "JDN1F":I
    sub-int v1, p1, v0

    .line 86
    .local v1, "k":I
    if-ltz v1, :cond_3c

    .line 87
    const/16 v2, 0xb9

    if-gt v1, v2, :cond_2d

    .line 88
    div-int/lit8 v2, v1, 0x1f

    add-int/lit8 v2, v2, 0x2

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jM:I

    .line 89
    rem-int/lit8 v2, v1, 0x1f

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jD:I

    .line 103
    :goto_2c
    return-void

    .line 92
    :cond_2d
    add-int/lit16 v1, v1, -0xba

    .line 101
    :cond_2f
    :goto_2f
    div-int/lit8 v2, v1, 0x1e

    add-int/lit8 v2, v2, 0x7

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jM:I

    .line 102
    rem-int/lit8 v2, v1, 0x1e

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jD:I

    goto :goto_2c

    .line 95
    :cond_3c
    iget v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jY:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jY:I

    .line 96
    add-int/lit16 v1, v1, 0xb3

    .line 97
    iget v2, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->leap:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2f

    .line 98
    add-int/lit8 v1, v1, 0x1

    goto :goto_2f
.end method

.method private JG2JD(IIII)I
    .registers 9
    .param p1, "year"    # I
    .param p2, "month"    # I
    .param p3, "day"    # I
    .param p4, "J1G0"    # I

    .prologue
    .line 34
    add-int/lit16 v1, p1, 0x12c0

    add-int/lit8 v2, p2, -0xe

    div-int/lit8 v2, v2, 0xc

    add-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x5b5

    div-int/lit8 v1, v1, 0x4

    add-int/lit8 v2, p2, -0x2

    add-int/lit8 v3, p2, -0xe

    div-int/lit8 v3, v3, 0xc

    mul-int/lit8 v3, v3, 0xc

    sub-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x16f

    div-int/lit8 v2, v2, 0xc

    add-int/2addr v1, v2

    add-int/lit16 v2, p1, 0x1324

    add-int/lit8 v3, p2, -0xe

    div-int/lit8 v3, v3, 0xc

    add-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x64

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0x4

    sub-int/2addr v1, v2

    add-int/2addr v1, p3

    add-int/lit16 v0, v1, -0x7d4b

    .line 39
    .local v0, "jd":I
    if-nez p4, :cond_3f

    .line 40
    const v1, 0x18704

    add-int/2addr v1, p1

    add-int/lit8 v2, p2, -0x8

    div-int/lit8 v2, v2, 0x6

    add-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x64

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x4

    sub-int v1, v0, v1

    add-int/lit16 v0, v1, 0x2f0

    .line 42
    :cond_3f
    return v0
.end method

.method private Jal2JD(III)I
    .registers 9
    .param p1, "jY"    # I
    .param p2, "jM"    # I
    .param p3, "jD"    # I

    .prologue
    .line 107
    invoke-direct {p0, p1}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JalCal(I)V

    .line 108
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    const/4 v2, 0x3

    iget v3, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->march:I

    const/4 v4, 0x1

    invoke-direct {p0, v1, v2, v3, v4}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JG2JD(IIII)I

    move-result v1

    add-int/lit8 v2, p2, -0x1

    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v1, v2

    div-int/lit8 v2, p2, 0x7

    add-int/lit8 v3, p2, -0x7

    mul-int/2addr v2, v3

    sub-int/2addr v1, v2

    add-int/2addr v1, p3

    add-int/lit8 v0, v1, -0x1

    .line 110
    .local v0, "jd":I
    return v0
.end method

.method private JalCal(I)V
    .registers 13
    .param p1, "jY"    # I

    .prologue
    const/4 v10, 0x4

    const/4 v9, 0x0

    .line 122
    iput v9, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->march:I

    .line 123
    iput v9, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->leap:I

    .line 125
    const/16 v8, 0x14

    new-array v1, v8, [I

    fill-array-data v1, :array_80

    .line 128
    .local v1, "breaks":[I
    add-int/lit16 v8, p1, 0x26d

    iput v8, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    .line 129
    const/16 v7, -0xe

    .line 130
    .local v7, "leapJ":I
    aget v4, v1, v9

    .line 132
    .local v4, "jp":I
    const/4 v5, 0x0

    .line 133
    .local v5, "jump":I
    const/4 v2, 0x1

    .local v2, "j":I
    :goto_17
    const/16 v8, 0x13

    if-gt v2, v8, :cond_70

    .line 134
    aget v3, v1, v2

    .line 135
    .local v3, "jm":I
    sub-int v5, v3, v4

    .line 136
    if-ge p1, v3, :cond_71

    .line 137
    sub-int v0, p1, v4

    .line 138
    .local v0, "N":I
    div-int/lit8 v8, v0, 0x21

    mul-int/lit8 v8, v8, 0x8

    add-int/2addr v8, v7

    rem-int/lit8 v9, v0, 0x21

    add-int/lit8 v9, v9, 0x3

    div-int/lit8 v9, v9, 0x4

    add-int v7, v8, v9

    .line 140
    rem-int/lit8 v8, v5, 0x21

    if-ne v8, v10, :cond_3a

    sub-int v8, v5, v0

    if-ne v8, v10, :cond_3a

    .line 141
    add-int/lit8 v7, v7, 0x1

    .line 143
    :cond_3a
    iget v8, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    div-int/lit8 v8, v8, 0x4

    iget v9, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    div-int/lit8 v9, v9, 0x64

    add-int/lit8 v9, v9, 0x1

    mul-int/lit8 v9, v9, 0x3

    div-int/lit8 v9, v9, 0x4

    sub-int/2addr v8, v9

    add-int/lit16 v6, v8, -0x96

    .line 145
    .local v6, "leapG":I
    add-int/lit8 v8, v7, 0x14

    sub-int/2addr v8, v6

    iput v8, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->march:I

    .line 147
    sub-int v8, v5, v0

    const/4 v9, 0x6

    if-ge v8, v9, :cond_5f

    .line 148
    sub-int v8, v0, v5

    add-int/lit8 v9, v5, 0x4

    div-int/lit8 v9, v9, 0x21

    mul-int/lit8 v9, v9, 0x21

    add-int v0, v8, v9

    .line 150
    :cond_5f
    add-int/lit8 v8, v0, 0x1

    rem-int/lit8 v8, v8, 0x21

    add-int/lit8 v8, v8, -0x1

    rem-int/lit8 v8, v8, 0x4

    iput v8, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->leap:I

    .line 152
    iget v8, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->leap:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_70

    .line 153
    iput v10, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->leap:I

    .line 160
    .end local v0    # "N":I
    .end local v3    # "jm":I
    .end local v6    # "leapG":I
    :cond_70
    return-void

    .line 157
    .restart local v3    # "jm":I
    :cond_71
    div-int/lit8 v8, v5, 0x21

    mul-int/lit8 v8, v8, 0x8

    add-int/2addr v8, v7

    rem-int/lit8 v9, v5, 0x21

    div-int/lit8 v9, v9, 0x4

    add-int v7, v8, v9

    .line 158
    move v4, v3

    .line 133
    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    .line 125
    :array_80
    .array-data 4
        -0x3d
        0x9
        0x26
        0xc7
        0x1aa
        0x2ae
        0x2f4
        0x332
        0x457
        0x49d
        0x4ba
        0x663
        0x80c
        0x831
        0x890
        0x8d6
        0x914
        0x95a
        0x998
        0xc6a
    .end array-data
.end method


# virtual methods
.method public GregorianToPersian(III)V
    .registers 6
    .param p1, "year"    # I
    .param p2, "month"    # I
    .param p3, "day"    # I

    .prologue
    .line 183
    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3, v1}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JG2JD(IIII)I

    move-result v0

    .line 184
    .local v0, "jd":I
    invoke-direct {p0, v0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JD2Jal(I)V

    .line 185
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jY:I

    iput v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->year:I

    .line 186
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jM:I

    iput v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->month:I

    .line 187
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->jD:I

    iput v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->day:I

    .line 188
    return-void
.end method

.method public PersianToGregorian(III)V
    .registers 6
    .param p1, "year"    # I
    .param p2, "month"    # I
    .param p3, "day"    # I

    .prologue
    .line 201
    invoke-direct {p0, p1, p2, p3}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->Jal2JD(III)I

    move-result v0

    .line 202
    .local v0, "jd":I
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->JD2JG(II)V

    .line 203
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gY:I

    iput v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->year:I

    .line 204
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gM:I

    iput v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->month:I

    .line 205
    iget v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->gD:I

    iput v1, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->day:I

    .line 206
    return-void
.end method

.method public getDay()I
    .registers 2

    .prologue
    .line 214
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->day:I

    return v0
.end method

.method public getMonth()I
    .registers 2

    .prologue
    .line 223
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->month:I

    return v0
.end method

.method public getYear()I
    .registers 2

    .prologue
    .line 232
    iget v0, p0, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->year:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    .prologue
    .line 169
    const-string v0, "%04d-%02d-%02d"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->getYear()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->getMonth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-virtual {p0}, Lorg/pouyadr/Pouya/utils/shamsicalendars/Roozh;->getDay()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
