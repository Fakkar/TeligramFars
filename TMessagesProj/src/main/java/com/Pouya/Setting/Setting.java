.class public Lorg/pouyadr/Pouya/Setting/Setting;
.super Ljava/lang/Object;
.source "Setting.java"


# static fields
.field private static final PREF_NAME:Ljava/lang/String; = "Stors"

.field static PRIVATE_MODE:I

.field static _context:Landroid/content/Context;

.field static editor:Landroid/content/SharedPreferences$Editor;

.field static pref:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 18
    const/4 v0, 0x0

    sput v0, Lorg/pouyadr/Pouya/Setting/Setting;->PRIVATE_MODE:I

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAnsweringMachine()Z
    .registers 3

    .prologue
    .line 101
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 102
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "answeringmachine"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getAnsweringmachineText()Ljava/lang/String;
    .registers 4

    .prologue
    .line 55
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 56
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "answeringmachineanswer"

    const-string v2, "AnsweringmachineDefaulttext"

    const v3, 0x7f08042c

    invoke-static {v2, v3}, Lorg/pouyadr/messenger/LocaleController;->getString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDatePersian()Z
    .registers 3

    .prologue
    .line 119
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 120
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "dateispersian"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getFavorList()Ljava/lang/String;
    .registers 3

    .prologue
    .line 74
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 75
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "favors"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getGhostMode()Z
    .registers 3

    .prologue
    .line 45
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 46
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "ghostmode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getHiddenList()Ljava/lang/String;
    .registers 3

    .prologue
    .line 83
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 84
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "hidden"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getSendTyping()Z
    .registers 3

    .prologue
    .line 92
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 93
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "sendtype"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getShowTimeAgo()Z
    .registers 3

    .prologue
    .line 105
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 106
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "showtimeago"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getTabletMode()Z
    .registers 3

    .prologue
    .line 35
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 36
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "tabletmode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getTheme()I
    .registers 3

    .prologue
    .line 65
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 66
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "themeid"

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static isfirsttime()Z
    .registers 3

    .prologue
    .line 128
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 129
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    const-string v1, "isfirsttime"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static setAnsweringMachine(Ljava/lang/Boolean;)V
    .registers 4
    .param p0, "on"    # Ljava/lang/Boolean;

    .prologue
    .line 96
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 97
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "answeringmachine"

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 98
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 99
    return-void
.end method

.method public static setAnsweringmachineText(Ljava/lang/String;)V
    .registers 3
    .param p0, "answer"    # Ljava/lang/String;

    .prologue
    .line 49
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 50
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "answeringmachineanswer"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 51
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 52
    return-void
.end method

.method public static setDatePersian(Ljava/lang/Boolean;)V
    .registers 4
    .param p0, "on"    # Ljava/lang/Boolean;

    .prologue
    .line 114
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 115
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "dateispersian"

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 116
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 117
    return-void
.end method

.method public static setFavorList(Ljava/lang/String;)V
    .registers 3
    .param p0, "list"    # Ljava/lang/String;

    .prologue
    .line 78
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 79
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "favors"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 80
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 81
    return-void
.end method

.method public static setGhostMode(Ljava/lang/Boolean;)V
    .registers 4
    .param p0, "on"    # Ljava/lang/Boolean;

    .prologue
    .line 39
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 40
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "ghostmode"

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 41
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 42
    return-void
.end method

.method public static setHiddenList(Ljava/lang/String;)V
    .registers 3
    .param p0, "list"    # Ljava/lang/String;

    .prologue
    .line 87
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 88
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "hidden"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 89
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 90
    return-void
.end method

.method public static setSendTyping(Ljava/lang/Boolean;)V
    .registers 4
    .param p0, "on"    # Ljava/lang/Boolean;

    .prologue
    .line 69
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 70
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "sendtype"

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 71
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 72
    return-void
.end method

.method public static setShowTimeAgo(Ljava/lang/Boolean;)V
    .registers 4
    .param p0, "on"    # Ljava/lang/Boolean;

    .prologue
    .line 109
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 110
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "showtimeago"

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 111
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 112
    return-void
.end method

.method public static setTabletMode(Ljava/lang/Boolean;)V
    .registers 4
    .param p0, "on"    # Ljava/lang/Boolean;

    .prologue
    .line 29
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 30
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "tabletmode"

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 31
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 32
    return-void
.end method

.method public static setTheme(I)V
    .registers 3
    .param p0, "id"    # I

    .prologue
    .line 59
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 60
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "themeid"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 61
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 62
    return-void
.end method

.method public static setisfirsttime(Ljava/lang/Boolean;)V
    .registers 4
    .param p0, "on"    # Ljava/lang/Boolean;

    .prologue
    .line 123
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->setupSetting()V

    .line 124
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "isfirsttime"

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 125
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 126
    return-void
.end method

.method private static setupSetting()V
    .registers 3

    .prologue
    .line 22
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    if-nez v0, :cond_1c

    .line 23
    sget-object v0, Lorg/pouyadr/messenger/ApplicationLoader;->applicationContext:Landroid/content/Context;

    sput-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->_context:Landroid/content/Context;

    .line 24
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->_context:Landroid/content/Context;

    const-string v1, "Stors"

    sget v2, Lorg/pouyadr/Pouya/Setting/Setting;->PRIVATE_MODE:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    .line 25
    sget-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->pref:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sput-object v0, Lorg/pouyadr/Pouya/Setting/Setting;->editor:Landroid/content/SharedPreferences$Editor;

    .line 27
    :cond_1c
    return-void
.end method
