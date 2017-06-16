.class Lorg/pouyadr/finalsoft/CleanCache$1;
.super Ljava/lang/Object;
.source "CleanCache.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/pouyadr/finalsoft/CleanCache;->cleanDatabaseRow(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/pouyadr/finalsoft/CleanCache;

.field final synthetic val$progressDialog:Landroid/app/ProgressDialog;


# direct methods
.method constructor <init>(Lorg/pouyadr/finalsoft/CleanCache;Landroid/app/ProgressDialog;)V
    .registers 3
    .param p1, "this$0"    # Lorg/pouyadr/finalsoft/CleanCache;

    .prologue
    .line 34
    iput-object p1, p0, Lorg/pouyadr/finalsoft/CleanCache$1;->this$0:Lorg/pouyadr/finalsoft/CleanCache;

    iput-object p2, p0, Lorg/pouyadr/finalsoft/CleanCache$1;->val$progressDialog:Landroid/app/ProgressDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 29

    .prologue
    .line 38
    :try_start_0
    invoke-static {}, Lorg/pouyadr/messenger/MessagesStorage;->getInstance()Lorg/pouyadr/messenger/MessagesStorage;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/messenger/MessagesStorage;->getDatabase()Lorg/pouyadr/SQLite/SQLiteDatabase;

    move-result-object v13

    .line 39
    .local v13, "database":Lorg/pouyadr/SQLite/SQLiteDatabase;
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .local v14, "dialogsToCleanup":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Long;>;"
    const-string v2, "SELECT did FROM dialogs WHERE 1"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v13, v2, v3}, Lorg/pouyadr/SQLite/SQLiteDatabase;->queryFinalized(Ljava/lang/String;[Ljava/lang/Object;)Lorg/pouyadr/SQLite/SQLiteCursor;

    move-result-object v10

    .line 41
    .local v10, "cursor":Lorg/pouyadr/SQLite/SQLiteCursor;
    new-instance v19, Ljava/lang/StringBuilder;

    invoke-direct/range {v19 .. v19}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .local v19, "ids":Ljava/lang/StringBuilder;
    :cond_1b
    :goto_1b
    invoke-virtual {v10}, Lorg/pouyadr/SQLite/SQLiteCursor;->next()Z

    move-result v2

    if-eqz v2, :cond_52

    .line 43
    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lorg/pouyadr/SQLite/SQLiteCursor;->longValue(I)J

    move-result-wide v16

    .line 44
    .local v16, "did":J
    move-wide/from16 v0, v16

    long-to-int v0, v0

    move/from16 v24, v0

    .line 45
    .local v24, "lower_id":I
    const/16 v2, 0x20

    shr-long v2, v16, v2

    long-to-int v0, v2

    move/from16 v18, v0

    .line 46
    .local v18, "high_id":I
    if-eqz v24, :cond_1b

    const/4 v2, 0x1

    move/from16 v0, v18

    if-eq v0, v2, :cond_1b

    .line 47
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_40
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_40} :catch_41
    .catchall {:try_start_0 .. :try_end_40} :catchall_276

    goto :goto_1b

    .line 111
    .end local v10    # "cursor":Lorg/pouyadr/SQLite/SQLiteCursor;
    .end local v13    # "database":Lorg/pouyadr/SQLite/SQLiteDatabase;
    .end local v14    # "dialogsToCleanup":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Long;>;"
    .end local v16    # "did":J
    .end local v18    # "high_id":I
    .end local v19    # "ids":Ljava/lang/StringBuilder;
    .end local v24    # "lower_id":I
    :catch_41
    move-exception v15

    .line 112
    .local v15, "e":Ljava/lang/Exception;
    :try_start_42
    const-string v2, "tmessages"

    invoke-static {v2, v15}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_47
    .catchall {:try_start_42 .. :try_end_47} :catchall_276

    .line 114
    new-instance v2, Lorg/pouyadr/finalsoft/CleanCache$1$1;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lorg/pouyadr/finalsoft/CleanCache$1$1;-><init>(Lorg/pouyadr/finalsoft/CleanCache$1;)V

    invoke-static {v2}, Lorg/pouyadr/messenger/AndroidUtilities;->runOnUIThread(Ljava/lang/Runnable;)V

    .line 130
    .end local v15    # "e":Ljava/lang/Exception;
    :goto_51
    return-void

    .line 50
    .restart local v10    # "cursor":Lorg/pouyadr/SQLite/SQLiteCursor;
    .restart local v13    # "database":Lorg/pouyadr/SQLite/SQLiteDatabase;
    .restart local v14    # "dialogsToCleanup":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Long;>;"
    .restart local v19    # "ids":Ljava/lang/StringBuilder;
    :cond_52
    :try_start_52
    invoke-virtual {v10}, Lorg/pouyadr/SQLite/SQLiteCursor;->dispose()V

    .line 52
    const-string v2, "REPLACE INTO messages_holes VALUES(?, ?, ?)"

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v4

    .line 53
    .local v4, "state5":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    const-string v2, "REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)"

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v5

    .line 54
    .local v5, "state6":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    const-string v2, "REPLACE INTO messages_imp_holes VALUES(?, ?, ?)"

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v6

    .line 55
    .local v6, "state7":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    const-string v2, "REPLACE INTO channel_group VALUES(?, ?, ?, ?)"

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v7

    .line 57
    .local v7, "state8":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    invoke-virtual {v13}, Lorg/pouyadr/SQLite/SQLiteDatabase;->beginTransaction()V

    .line 58
    const/4 v9, 0x0

    .local v9, "a":I
    :goto_71
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v9, v2, :cond_282

    .line 59
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/Long;

    .line 60
    .local v16, "did":Ljava/lang/Long;
    const/16 v26, 0x0

    .line 61
    .local v26, "messagesCount":I
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SELECT COUNT(mid) FROM messages WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v13, v2, v3}, Lorg/pouyadr/SQLite/SQLiteDatabase;->queryFinalized(Ljava/lang/String;[Ljava/lang/Object;)Lorg/pouyadr/SQLite/SQLiteCursor;

    move-result-object v10

    .line 62
    invoke-virtual {v10}, Lorg/pouyadr/SQLite/SQLiteCursor;->next()Z

    move-result v2

    if-eqz v2, :cond_a6

    .line 63
    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lorg/pouyadr/SQLite/SQLiteCursor;->intValue(I)I

    move-result v26

    .line 65
    :cond_a6
    invoke-virtual {v10}, Lorg/pouyadr/SQLite/SQLiteCursor;->dispose()V

    .line 66
    const/4 v2, 0x2

    move/from16 v0, v26

    if-gt v0, v2, :cond_b1

    .line 58
    :goto_ae
    add-int/lit8 v9, v9, 0x1

    goto :goto_71

    .line 70
    :cond_b1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SELECT last_mid_i, last_mid FROM dialogs WHERE did = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v13, v2, v3}, Lorg/pouyadr/SQLite/SQLiteDatabase;->queryFinalized(Ljava/lang/String;[Ljava/lang/Object;)Lorg/pouyadr/SQLite/SQLiteCursor;

    move-result-object v10

    .line 71
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .local v8, "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/tgnet/TLRPC$Message;>;"
    invoke-virtual {v10}, Lorg/pouyadr/SQLite/SQLiteCursor;->next()Z

    move-result v2

    if-eqz v2, :cond_271

    .line 73
    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Lorg/pouyadr/SQLite/SQLiteCursor;->longValue(I)J

    move-result-wide v22

    .line 74
    .local v22, "last_mid_i":J
    const/4 v2, 0x1

    invoke-virtual {v10, v2}, Lorg/pouyadr/SQLite/SQLiteCursor;->longValue(I)J

    move-result-wide v20

    .line 75
    .local v20, "last_mid":J
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SELECT data FROM messages WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " AND mid IN ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v0, v22

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v0, v20

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v13, v2, v3}, Lorg/pouyadr/SQLite/SQLiteDatabase;->queryFinalized(Ljava/lang/String;[Ljava/lang/Object;)Lorg/pouyadr/SQLite/SQLiteCursor;
    :try_end_11b
    .catch Ljava/lang/Exception; {:try_start_52 .. :try_end_11b} :catch_41
    .catchall {:try_start_52 .. :try_end_11b} :catchall_276

    move-result-object v11

    .line 77
    .local v11, "cursor2":Lorg/pouyadr/SQLite/SQLiteCursor;
    :cond_11c
    :goto_11c
    :try_start_11c
    invoke-virtual {v11}, Lorg/pouyadr/SQLite/SQLiteCursor;->next()Z

    move-result v2

    if-eqz v2, :cond_144

    .line 78
    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lorg/pouyadr/SQLite/SQLiteCursor;->byteBufferValue(I)Lorg/pouyadr/tgnet/NativeByteBuffer;

    move-result-object v12

    .line 79
    .local v12, "data":Lorg/pouyadr/tgnet/NativeByteBuffer;
    if-eqz v12, :cond_11c

    .line 80
    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Lorg/pouyadr/tgnet/NativeByteBuffer;->readInt32(Z)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v12, v2, v3}, Lorg/pouyadr/tgnet/TLRPC$Message;->TLdeserialize(Lorg/pouyadr/tgnet/AbstractSerializedData;IZ)Lorg/pouyadr/tgnet/TLRPC$Message;

    move-result-object v25

    .line 81
    .local v25, "message":Lorg/pouyadr/tgnet/TLRPC$Message;
    invoke-virtual {v12}, Lorg/pouyadr/tgnet/NativeByteBuffer;->reuse()V

    .line 82
    if-eqz v25, :cond_11c

    .line 83
    move-object/from16 v0, v25

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_13d
    .catch Ljava/lang/Exception; {:try_start_11c .. :try_end_13d} :catch_13e
    .catchall {:try_start_11c .. :try_end_13d} :catchall_276

    goto :goto_11c

    .line 87
    .end local v12    # "data":Lorg/pouyadr/tgnet/NativeByteBuffer;
    .end local v25    # "message":Lorg/pouyadr/tgnet/TLRPC$Message;
    :catch_13e
    move-exception v15

    .line 88
    .restart local v15    # "e":Ljava/lang/Exception;
    :try_start_13f
    const-string v2, "tmessages"

    invoke-static {v2, v15}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .end local v15    # "e":Ljava/lang/Exception;
    :cond_144
    invoke-virtual {v11}, Lorg/pouyadr/SQLite/SQLiteCursor;->dispose()V

    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM messages WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " AND mid != "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v0, v22

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " AND mid != "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v0, v20

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM channel_group WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 94
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM messages_holes WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM messages_imp_holes WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM bot_keyboard WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 97
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM media_counts_v2 WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 98
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM media_v2 WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 99
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM media_holes_v2 WHERE uid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 100
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const/16 v27, 0x0

    move-object/from16 v0, v27

    invoke-static {v2, v3, v0}, Lorg/pouyadr/messenger/query/BotQuery;->clearBotKeyboard(JLjava/util/ArrayList;)V

    .line 101
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static/range {v2 .. v8}, Lorg/pouyadr/messenger/MessagesStorage;->createFirstHoles(JLorg/pouyadr/SQLite/SQLitePreparedStatement;Lorg/pouyadr/SQLite/SQLitePreparedStatement;Lorg/pouyadr/SQLite/SQLitePreparedStatement;Lorg/pouyadr/SQLite/SQLitePreparedStatement;Ljava/util/ArrayList;)V

    .line 103
    .end local v11    # "cursor2":Lorg/pouyadr/SQLite/SQLiteCursor;
    .end local v20    # "last_mid":J
    .end local v22    # "last_mid_i":J
    :cond_271
    invoke-virtual {v10}, Lorg/pouyadr/SQLite/SQLiteCursor;->dispose()V
    :try_end_274
    .catch Ljava/lang/Exception; {:try_start_13f .. :try_end_274} :catch_41
    .catchall {:try_start_13f .. :try_end_274} :catchall_276

    goto/16 :goto_ae

    .line 114
    .end local v4    # "state5":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .end local v5    # "state6":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .end local v6    # "state7":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .end local v7    # "state8":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .end local v8    # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/pouyadr/tgnet/TLRPC$Message;>;"
    .end local v9    # "a":I
    .end local v10    # "cursor":Lorg/pouyadr/SQLite/SQLiteCursor;
    .end local v13    # "database":Lorg/pouyadr/SQLite/SQLiteDatabase;
    .end local v14    # "dialogsToCleanup":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Long;>;"
    .end local v16    # "did":Ljava/lang/Long;
    .end local v19    # "ids":Ljava/lang/StringBuilder;
    .end local v26    # "messagesCount":I
    :catchall_276
    move-exception v2

    new-instance v3, Lorg/pouyadr/finalsoft/CleanCache$1$1;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lorg/pouyadr/finalsoft/CleanCache$1$1;-><init>(Lorg/pouyadr/finalsoft/CleanCache$1;)V

    invoke-static {v3}, Lorg/pouyadr/messenger/AndroidUtilities;->runOnUIThread(Ljava/lang/Runnable;)V

    throw v2

    .line 105
    .restart local v4    # "state5":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .restart local v5    # "state6":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .restart local v6    # "state7":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .restart local v7    # "state8":Lorg/pouyadr/SQLite/SQLitePreparedStatement;
    .restart local v9    # "a":I
    .restart local v10    # "cursor":Lorg/pouyadr/SQLite/SQLiteCursor;
    .restart local v13    # "database":Lorg/pouyadr/SQLite/SQLiteDatabase;
    .restart local v14    # "dialogsToCleanup":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Long;>;"
    .restart local v19    # "ids":Ljava/lang/StringBuilder;
    :cond_282
    :try_start_282
    invoke-virtual {v4}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 106
    invoke-virtual {v5}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 107
    invoke-virtual {v6}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 108
    invoke-virtual {v7}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 109
    invoke-virtual {v13}, Lorg/pouyadr/SQLite/SQLiteDatabase;->commitTransaction()V

    .line 110
    const-string v2, "VACUUM"

    invoke-virtual {v13, v2}, Lorg/pouyadr/SQLite/SQLiteDatabase;->executeFast(Ljava/lang/String;)Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->stepThis()Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V
    :try_end_29e
    .catch Ljava/lang/Exception; {:try_start_282 .. :try_end_29e} :catch_41
    .catchall {:try_start_282 .. :try_end_29e} :catchall_276

    .line 114
    new-instance v2, Lorg/pouyadr/finalsoft/CleanCache$1$1;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lorg/pouyadr/finalsoft/CleanCache$1$1;-><init>(Lorg/pouyadr/finalsoft/CleanCache$1;)V

    invoke-static {v2}, Lorg/pouyadr/messenger/AndroidUtilities;->runOnUIThread(Ljava/lang/Runnable;)V

    goto/16 :goto_51
.end method
