.class public Lorg/pouyadr/PhoneFormat/PhoneRule;
.super Ljava/lang/Object;
.source "PhoneRule.java"


# instance fields
.field public byte8:I

.field public flag12:I

.field public flag13:I

.field public format:Ljava/lang/String;

.field public hasIntlPrefix:Z

.field public hasTrunkPrefix:Z

.field public maxLen:I

.field public maxVal:I

.field public minVal:I

.field public otherFlag:I

.field public prefixLen:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method format(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 15
    .param p1, "str"    # Ljava/lang/String;
    .param p2, "intlPrefix"    # Ljava/lang/String;
    .param p3, "trunkPrefix"    # Ljava/lang/String;

    .prologue
    const/16 v10, 0x29

    const/4 v9, 0x0

    .line 41
    const/4 v1, 0x0

    .line 42
    .local v1, "hadC":Z
    const/4 v2, 0x0

    .line 43
    .local v2, "hadN":Z
    const/4 v3, 0x0

    .line 44
    .local v3, "hasOpen":Z
    const/4 v6, 0x0

    .line 45
    .local v6, "spot":I
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v7, 0x14

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 46
    .local v5, "res":Ljava/lang/StringBuilder;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_f
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v4, v7, :cond_8d

    .line 47
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 48
    .local v0, "ch":C
    sparse-switch v0, :sswitch_data_ac

    .line 74
    :cond_20
    :goto_20
    const/16 v7, 0x20

    if-ne v0, v7, :cond_42

    if-lez v4, :cond_42

    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    add-int/lit8 v8, v4, -0x1

    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x6e

    if-ne v7, v8, :cond_34

    if-eqz p3, :cond_5a

    :cond_34
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    add-int/lit8 v8, v4, -0x1

    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x63

    if-ne v7, v8, :cond_42

    if-eqz p2, :cond_5a

    .line 75
    :cond_42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-lt v6, v7, :cond_4c

    if-eqz v3, :cond_5a

    if-ne v0, v10, :cond_5a

    .line 76
    :cond_4c
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/PhoneRule;->format:Ljava/lang/String;

    add-int/lit8 v8, v4, 0x1

    invoke-virtual {v7, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    if-ne v0, v10, :cond_5a

    .line 78
    const/4 v3, 0x0

    .line 46
    :cond_5a
    :goto_5a
    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    .line 50
    :sswitch_5d
    const/4 v1, 0x1

    .line 51
    if-eqz p2, :cond_5a

    .line 52
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5a

    .line 56
    :sswitch_64
    const/4 v2, 0x1

    .line 57
    if-eqz p3, :cond_5a

    .line 58
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5a

    .line 62
    :sswitch_6b
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_7d

    .line 63
    add-int/lit8 v7, v6, 0x1

    invoke-virtual {p1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    add-int/lit8 v6, v6, 0x1

    goto :goto_5a

    .line 65
    :cond_7d
    if-eqz v3, :cond_5a

    .line 66
    const-string v7, " "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5a

    .line 70
    :sswitch_85
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_20

    .line 71
    const/4 v3, 0x1

    goto :goto_20

    .line 85
    .end local v0    # "ch":C
    :cond_8d
    if-eqz p2, :cond_a4

    if-nez v1, :cond_a4

    .line 86
    const-string v7, "%s "

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    aput-object p2, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v9, v7}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    :cond_9f
    :goto_9f
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    return-object v7

    .line 87
    :cond_a4
    if-eqz p3, :cond_9f

    if-nez v2, :cond_9f

    .line 88
    invoke-virtual {v5, v9, p3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9f

    .line 48
    :sswitch_data_ac
    .sparse-switch
        0x23 -> :sswitch_6b
        0x28 -> :sswitch_85
        0x63 -> :sswitch_5d
        0x6e -> :sswitch_64
    .end sparse-switch
.end method

.method hasIntlPrefix()Z
    .registers 2

    .prologue
    .line 95
    iget v0, p0, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    :goto_7
    return v0

    :cond_8
    const/4 v0, 0x0

    goto :goto_7
.end method

.method hasTrunkPrefix()Z
    .registers 2

    .prologue
    .line 99
    iget v0, p0, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    :goto_7
    return v0

    :cond_8
    const/4 v0, 0x0

    goto :goto_7
.end method
