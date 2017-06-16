.class public Lorg/pouyadr/PhoneFormat/RuleSet;
.super Ljava/lang/Object;
.source "RuleSet.java"


# static fields
.field public static pattern:Ljava/util/regex/Pattern;


# instance fields
.field public hasRuleWithIntlPrefix:Z

.field public hasRuleWithTrunkPrefix:Z

.field public matchLen:I

.field public rules:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/pouyadr/PhoneFormat/PhoneRule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 36
    const-string v0, "[0-9]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/pouyadr/PhoneFormat/RuleSet;->pattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method format(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .registers 14
    .param p1, "str"    # Ljava/lang/String;
    .param p2, "intlPrefix"    # Ljava/lang/String;
    .param p3, "trunkPrefix"    # Ljava/lang/String;
    .param p4, "prefixRequired"    # Z

    .prologue
    const/4 v5, 0x0

    const/4 v8, 0x0

    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    iget v7, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->matchLen:I

    if-lt v6, v7, :cond_67

    .line 40
    iget v6, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->matchLen:I

    invoke-virtual {p1, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 42
    .local v0, "begin":Ljava/lang/String;
    const/4 v4, 0x0

    .line 43
    .local v4, "val":I
    sget-object v6, Lorg/pouyadr/PhoneFormat/RuleSet;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 44
    .local v1, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_25

    .line 45
    invoke-virtual {v1, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 46
    .local v2, "num":Ljava/lang/String;
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 49
    .end local v2    # "num":Ljava/lang/String;
    :cond_25
    iget-object v6, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_81

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/PhoneFormat/PhoneRule;

    .line 50
    .local v3, "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->minVal:I

    if-lt v4, v7, :cond_2b

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxVal:I

    if-gt v4, v7, :cond_2b

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxLen:I

    if-gt v7, v8, :cond_2b

    .line 51
    if-eqz p4, :cond_68

    .line 52
    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v7, v7, 0x3

    if-nez v7, :cond_53

    if-nez p3, :cond_53

    if-eqz p2, :cond_63

    :cond_53
    if-eqz p3, :cond_5b

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v7, v7, 0x1

    if-nez v7, :cond_63

    :cond_5b
    if-eqz p2, :cond_2b

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v7, v7, 0x2

    if-eqz v7, :cond_2b

    .line 53
    :cond_63
    invoke-virtual {v3, p1, p2, p3}, Lorg/pouyadr/PhoneFormat/PhoneRule;->format(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 85
    .end local v0    # "begin":Ljava/lang/String;
    .end local v1    # "matcher":Ljava/util/regex/Matcher;
    .end local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    .end local v4    # "val":I
    :cond_67
    :goto_67
    return-object v5

    .line 56
    .restart local v0    # "begin":Ljava/lang/String;
    .restart local v1    # "matcher":Ljava/util/regex/Matcher;
    .restart local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    .restart local v4    # "val":I
    :cond_68
    if-nez p3, :cond_6c

    if-eqz p2, :cond_7c

    :cond_6c
    if-eqz p3, :cond_74

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v7, v7, 0x1

    if-nez v7, :cond_7c

    :cond_74
    if-eqz p2, :cond_2b

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v7, v7, 0x2

    if-eqz v7, :cond_2b

    .line 57
    :cond_7c
    invoke-virtual {v3, p1, p2, p3}, Lorg/pouyadr/PhoneFormat/PhoneRule;->format(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_67

    .line 63
    .end local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    :cond_81
    if-nez p4, :cond_67

    .line 64
    if-eqz p2, :cond_b4

    .line 65
    iget-object v6, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_67

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/PhoneFormat/PhoneRule;

    .line 66
    .restart local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->minVal:I

    if-lt v4, v7, :cond_8b

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxVal:I

    if-gt v4, v7, :cond_8b

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxLen:I

    if-gt v7, v8, :cond_8b

    .line 67
    if-eqz p3, :cond_af

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v7, v7, 0x1

    if-eqz v7, :cond_8b

    .line 68
    :cond_af
    invoke-virtual {v3, p1, p2, p3}, Lorg/pouyadr/PhoneFormat/PhoneRule;->format(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_67

    .line 72
    .end local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    :cond_b4
    if-eqz p3, :cond_67

    .line 73
    iget-object v6, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_bc
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_67

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/PhoneFormat/PhoneRule;

    .line 74
    .restart local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->minVal:I

    if-lt v4, v7, :cond_bc

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxVal:I

    if-gt v4, v7, :cond_bc

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxLen:I

    if-gt v7, v8, :cond_bc

    .line 75
    if-eqz p2, :cond_e0

    iget v7, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v7, v7, 0x2

    if-eqz v7, :cond_bc

    .line 76
    :cond_e0
    invoke-virtual {v3, p1, p2, p3}, Lorg/pouyadr/PhoneFormat/PhoneRule;->format(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_67
.end method

.method isValid(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z
    .registers 15
    .param p1, "str"    # Ljava/lang/String;
    .param p2, "intlPrefix"    # Ljava/lang/String;
    .param p3, "trunkPrefix"    # Ljava/lang/String;
    .param p4, "prefixRequired"    # Z

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 90
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->matchLen:I

    if-lt v7, v8, :cond_df

    .line 91
    iget v7, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->matchLen:I

    invoke-virtual {p1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 92
    .local v0, "begin":Ljava/lang/String;
    const/4 v4, 0x0

    .line 93
    .local v4, "val":I
    sget-object v7, Lorg/pouyadr/PhoneFormat/RuleSet;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 94
    .local v1, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_25

    .line 95
    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 96
    .local v2, "num":Ljava/lang/String;
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 99
    .end local v2    # "num":Ljava/lang/String;
    :cond_25
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_79

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/PhoneFormat/PhoneRule;

    .line 100
    .local v3, "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->minVal:I

    if-lt v4, v8, :cond_2b

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxVal:I

    if-gt v4, v8, :cond_2b

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    iget v9, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxLen:I

    if-ne v8, v9, :cond_2b

    .line 101
    if-eqz p4, :cond_64

    .line 102
    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v8, v8, 0x3

    if-nez v8, :cond_53

    if-nez p3, :cond_53

    if-eqz p2, :cond_63

    :cond_53
    if-eqz p3, :cond_5b

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v8, v8, 0x1

    if-nez v8, :cond_63

    :cond_5b
    if-eqz p2, :cond_2b

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v8, v8, 0x2

    if-eqz v8, :cond_2b

    .line 135
    .end local v0    # "begin":Ljava/lang/String;
    .end local v1    # "matcher":Ljava/util/regex/Matcher;
    .end local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    .end local v4    # "val":I
    :cond_63
    :goto_63
    return v5

    .line 106
    .restart local v0    # "begin":Ljava/lang/String;
    .restart local v1    # "matcher":Ljava/util/regex/Matcher;
    .restart local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    .restart local v4    # "val":I
    :cond_64
    if-nez p3, :cond_68

    if-eqz p2, :cond_63

    :cond_68
    if-eqz p3, :cond_70

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v8, v8, 0x1

    if-nez v8, :cond_63

    :cond_70
    if-eqz p2, :cond_2b

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v8, v8, 0x2

    if-eqz v8, :cond_2b

    goto :goto_63

    .line 113
    .end local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    :cond_79
    if-nez p4, :cond_dd

    .line 114
    if-eqz p2, :cond_ac

    iget-boolean v7, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->hasRuleWithIntlPrefix:Z

    if-nez v7, :cond_ac

    .line 115
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_87
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_dd

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/PhoneFormat/PhoneRule;

    .line 116
    .restart local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->minVal:I

    if-lt v4, v8, :cond_87

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxVal:I

    if-gt v4, v8, :cond_87

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    iget v9, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxLen:I

    if-ne v8, v9, :cond_87

    .line 117
    if-eqz p3, :cond_63

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v8, v8, 0x1

    if-eqz v8, :cond_87

    goto :goto_63

    .line 122
    .end local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    :cond_ac
    if-eqz p3, :cond_dd

    iget-boolean v7, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->hasRuleWithTrunkPrefix:Z

    if-nez v7, :cond_dd

    .line 123
    iget-object v7, p0, Lorg/pouyadr/PhoneFormat/RuleSet;->rules:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_b8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_dd

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/pouyadr/PhoneFormat/PhoneRule;

    .line 124
    .restart local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->minVal:I

    if-lt v4, v8, :cond_b8

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxVal:I

    if-gt v4, v8, :cond_b8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    iget v9, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->maxLen:I

    if-ne v8, v9, :cond_b8

    .line 125
    if-eqz p2, :cond_63

    iget v8, v3, Lorg/pouyadr/PhoneFormat/PhoneRule;->flag12:I

    and-int/lit8 v8, v8, 0x2

    if-eqz v8, :cond_b8

    goto :goto_63

    .end local v3    # "rule":Lorg/pouyadr/PhoneFormat/PhoneRule;
    :cond_dd
    move v5, v6

    .line 133
    goto :goto_63

    .end local v0    # "begin":Ljava/lang/String;
    .end local v1    # "matcher":Ljava/util/regex/Matcher;
    .end local v4    # "val":I
    :cond_df
    move v5, v6

    .line 135
    goto :goto_63
.end method
