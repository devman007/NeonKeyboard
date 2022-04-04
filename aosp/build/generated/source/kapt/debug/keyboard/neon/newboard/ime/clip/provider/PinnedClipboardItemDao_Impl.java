package keyboard.neon.newboard.ime.clip.provider;

import android.database.Cursor;
import android.net.Uri;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PinnedClipboardItemDao_Impl implements PinnedClipboardItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ClipboardItem> __insertionAdapterOfClipboardItem;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<ClipboardItem> __deletionAdapterOfClipboardItem;

  public PinnedClipboardItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfClipboardItem = new EntityInsertionAdapter<ClipboardItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `pins` (`_id`,`type`,`uri`,`text`,`mimeTypes`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ClipboardItem value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
        final Integer _tmp = __converters.itemTypeToInt(value.getType());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        final String _tmp_1 = __converters.stringFromUri(value.getUri());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        if (value.getText() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getText());
        }
        final String _tmp_2 = __converters.mimeTypesToString(value.getMimeTypes());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
      }
    };
    this.__deletionAdapterOfClipboardItem = new EntityDeletionOrUpdateAdapter<ClipboardItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `pins` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ClipboardItem value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
      }
    };
  }

  @Override
  public long insert(final ClipboardItem item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfClipboardItem.insertAndReturnId(item);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final ClipboardItem item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfClipboardItem.handle(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ClipboardItem> getAll() {
    final String _sql = "SELECT * FROM pins";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
      final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
      final int _cursorIndexOfMimeTypes = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeTypes");
      final List<ClipboardItem> _result = new ArrayList<ClipboardItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ClipboardItem _item;
        final Long _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getLong(_cursorIndexOfUid);
        }
        final ItemType _tmpType;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfType)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfType);
        }
        _tmpType = __converters.intToItemType(_tmp);
        final Uri _tmpUri;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfUri)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfUri);
        }
        _tmpUri = __converters.uriFromString(_tmp_1);
        final String _tmpText;
        if (_cursor.isNull(_cursorIndexOfText)) {
          _tmpText = null;
        } else {
          _tmpText = _cursor.getString(_cursorIndexOfText);
        }
        final String[] _tmpMimeTypes;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfMimeTypes)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfMimeTypes);
        }
        _tmpMimeTypes = __converters.stringToMimeTypes(_tmp_2);
        _item = new ClipboardItem(_tmpUid,_tmpType,_tmpUri,_tmpText,_tmpMimeTypes);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
