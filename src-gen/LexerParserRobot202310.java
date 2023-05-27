// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/LexerParserRobot202310.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class LexerParserRobot202310 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object chars(Object string) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      int $v3=$int(0);
      int $v4=$int($invokeMethod("length",string,new Object[]{}))-1;
      $v2:for (int i=$v3; i<=$v4; i++) {
        $v1.add($invokeMethod("charAt",string,new Object[]{i}));
      }
      $result=$v1;
      if (true) break $try;
      $line=5;
      $rethrow(new RuntimeException("The function \"chars(string:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"chars",$line);
    }
    return $result;
  }
  public static Object charsStrings(Object strings) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v5=$newSet(GCollections.emptySet());
      $v6:for (Object s:GCollections.unmodifiableCollection(strings)) {
        $v5.union(GCollections.unmodifiableSet(((java.lang.Iterable)(LexerParserRobot202310.chars(s)))));
      }
      $result=$v5;
      if (true) break $try;
      $line=6;
      $rethrow(new RuntimeException("The function \"charsStrings(strings:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"charsStrings",$line);
    }
    return $result;
  }
  public static Object elements(Object array) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v7=$newSet();
      int $v9=$int(0);
      int $v10=$int($opAbsolY(array))-1;
      $v8:for (int i=$v9; i<=$v10; i++) {
        $v7.add($getArrayValue(array,new Object[]{i}));
      }
      $result=$v7;
      if (true) break $try;
      $line=7;
      $rethrow(new RuntimeException("The function \"elements(array:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"elements",$line);
    }
    return $result;
  }
  public static Object get1(java.lang.Iterable $v11) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v12=GCollections.unmodifiableCollection($v11).iterator();
      Object r=$v12.next();
      Object i=$v12.next();
      $result=r;
      if (true) break $try;
      $line=8;
      $rethrow(new RuntimeException("The function \"get1(\u27E8r,i\u27E9:java.lang.Iterable)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"get1",$line);
    }
    return $result;
  }
  public static Object get2(java.lang.Iterable $v13) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v14=GCollections.unmodifiableCollection($v13).iterator();
      Object r=$v14.next();
      Object i=$v14.next();
      $result=i;
      if (true) break $try;
      $line=9;
      $rethrow(new RuntimeException("The function \"get2(\u27E8r,i\u27E9:java.lang.Iterable)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"get2",$line);
    }
    return $result;
  }
  public static GDeterministicTransducer lexer=null;
  static {
    int $line=0;
    $line=12;
    $try:try {
      lexer=$defaultValue(GDeterministicTransducer.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,null,$line);
    }
  }
  public static GPushdownAutomaton parser=null;
  static {
    int $line=0;
    $line=13;
    $try:try {
      parser=$defaultValue(GPushdownAutomaton.class);
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,null,$line);
    }
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=16;
      Object currentString=$fix("");
      $line=18;
      lexer=$cast(GDeterministicTransducer.class,$fix(Lexer202310.createLexer()));
      $line=20;
      parser=$cast(GPushdownAutomaton.class,$fix(ParserRobot202310.createParser(((gold.structures.automaton.GDeterministicTransducer)lexer).getOutputAlphabet())));
      $line=28;
      LexerParserRobot202310.testLexerParser($cast(gold.structures.automaton.ITransducer.class,lexer),$cast(gold.structures.automaton.IPushdownAutomaton.class,parser));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"main",$line);
    }
  }
  public static Object testLexer(ITransducer M) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=33;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=34;
      String string=null;
      string=$defaultValue(String.class);
      $line=35;
      String input=null;
      input=$defaultValue(String.class);
      $line=38;
      Object inputA=$fix(LexerParserRobot202310.elements(((gold.structures.automaton.ITransducer)M).getInputAlphabet()));
      $line=39;
      input=$cast(String.class,$fix(""));
      $line=40;
      System.out.println($message(new Object[]{"----------------------------"}));
      $line=41;
      System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
      $line=42;
      System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
      $line=43;
      string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      $line=44;
      while (true) {
        if (!(!$opEqualY(string,"EXIT"))) break;
        $line=45;
        string=$cast(String.class,$fix($opAdditY(string," \n ")));
        $line=46;
        input=$cast(String.class,$fix(""));
        $line=47;
        while (true) {
          if (!(!$opEqualY(((java.lang.String)string).charAt($int(0)),'$'))) break;
          $line=48;
          input=$cast(String.class,$fix($opAdditY(input,string)));
          $line=49;
          string=$cast(String.class,$fix($opAdditY(((java.util.Scanner)sc).nextLine()," \n  ")));
        }
        $line=51;
        if ($opSbsetY(LexerParserRobot202310.chars(input),inputA)) {
          $line=52;
          Object currentString=$fix("");
          $line=53;
          Object images=$fix($invokeConstructor(GArrayList.class,new Object[]{}));
          $line=55;
          Object result=$fix(Lexer202310.runLexer(M,input));
          $line=58;
          Object ok=$fix(LexerParserRobot202310.get1($cast(java.lang.Iterable.class,result)));
          $line=59;
          images=$fix(LexerParserRobot202310.get2($cast(java.lang.Iterable.class,result)));
          $line=60;
          Object tokenStream=$fix(((gold.structures.automaton.ITransducer)M).getOutputString());
          $line=62;
          System.out.println($message(new Object[]{$opAdditY($opAdditY("The input was ",(($bool(ok))?(""):("not ")))," accepted by the lexer.")}));
          $line=63;
          if ($bool(ok)) {
            $line=64;
            System.out.println($message(new Object[]{$opAdditY("Token Stream:  ",tokenStream)}));
            $line=65;
            System.out.println($message(new Object[]{$opAdditY("Strings: ",images)}));
          }
          else {
            $line=66;
            System.out.println($message(new Object[]{$opAdditY("Partial token Stream ",tokenStream)}));
          }
        }
        else {
          $line=68;
          System.out.println($message(new Object[]{$opAdditY("Input contains invalid characters: ",$opDiffeY(LexerParserRobot202310.chars(input),inputA))}));
        }
        $line=70;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=72;
        System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
        $line=73;
        System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
        $line=74;
        string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      }
      $line=77;
      System.out.println($message(new Object[]{"Good bye"}));
      $line=78;
      System.out.println($message(new Object[]{""}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"testLexer",$line);
    }
    return $result;
  }
  public static Object testLexerParser(ITransducer M, IPushdownAutomaton P) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=89;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=90;
      String string=null;
      string=$defaultValue(String.class);
      $line=91;
      String input=null;
      input=$defaultValue(String.class);
      $line=94;
      Object inputA=$fix(LexerParserRobot202310.elements(((gold.structures.automaton.ITransducer)M).getInputAlphabet()));
      $line=95;
      Object inputP=$fix(LexerParserRobot202310.elements(((gold.structures.automaton.IPushdownAutomaton)P).getInputAlphabet()));
      $line=98;
      input=$cast(String.class,$fix(""));
      $line=101;
      System.out.println($message(new Object[]{"----------------------------"}));
      $line=102;
      System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
      $line=103;
      System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
      $line=104;
      string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      $line=109;
      while (true) {
        if (!(!$opEqualY(string,"EXIT"))) break;
        $line=111;
        string=$cast(String.class,$fix($opAdditY(string,"  \n ")));
        $line=112;
        input=$cast(String.class,$fix(""));
        $line=113;
        while (true) {
          if (!(!$opEqualY(((java.lang.String)string).charAt($int(0)),'$'))) break;
          $line=114;
          input=$cast(String.class,$fix($opAdditY(input,string)));
          $line=115;
          string=$cast(String.class,$fix($opAdditY(((java.util.Scanner)sc).nextLine()," \n ")));
        }
        $line=118;
        Object option=$fix("");
        $line=119;
        while (true) {
          if (!(!$opMembrY(option,GCollections.asSet("1","2","3")))) break;
          $line=120;
          System.out.println($message(new Object[]{"What do you want to do?"}));
          $line=121;
          System.out.println($message(new Object[]{"1. Lexer only?"}));
          $line=122;
          System.out.println($message(new Object[]{"2. Lexer and parser?"}));
          $line=123;
          System.out.println($message(new Object[]{"3. Parser?"}));
          $line=124;
          option=$fix(((java.util.Scanner)sc).nextLine());
        }
        $line=126;
        Object stringOut=$fix("");
        $line=127;
        if ($opMembrY(option,GCollections.asSet("1","2"))) {
          $line=128;
          if ($opSbsetY(LexerParserRobot202310.chars(input),inputA)) {
            $line=129;
            Object currentString=$fix("");
            $line=130;
            Object images=$fix($invokeConstructor(GArrayList.class,new Object[]{}));
            $line=132;
            Object result=$fix(Lexer202310.runLexer(M,input));
            $line=135;
            Object ok=$fix(LexerParserRobot202310.get1($cast(java.lang.Iterable.class,result)));
            $line=136;
            images=$fix(LexerParserRobot202310.get2($cast(java.lang.Iterable.class,result)));
            $line=137;
            Object tokenStream=$fix(((gold.structures.automaton.ITransducer)M).getOutputString());
            $line=142;
            System.out.println($message(new Object[]{$opAdditY($opAdditY("The input was ",(($bool(ok))?(""):("not ")))," accepted by the lexer.")}));
            $line=143;
            if ($bool(ok)) {
              $line=144;
              System.out.println($message(new Object[]{$opAdditY("Token Stream:  ",tokenStream)}));
              $line=145;
              System.out.println($message(new Object[]{$opAdditY("Strings: ",images)}));
              $line=146;
              if ($opEqualY(option,"2")) {
                $line=147;
                ok=$fix(((gold.structures.automaton.IPushdownAutomaton)P).acceptsString($cast(java.lang.String.class,tokenStream)));
                $line=148;
                System.out.println($message(new Object[]{$opAdditY("Parser result: ",(($bool(ok))?("accepted "):("rejected ")))}));
              }
            }
            else {
              $line=150;
              System.out.println($message(new Object[]{$opAdditY("Partial token Stream: ",tokenStream)}));
            }
          }
          else {
            $line=152;
            System.out.println($message(new Object[]{$opAdditY("Input contains invalid characters: ",$opDiffeY(LexerParserRobot202310.chars(input),inputA))}));
          }
        }
        else {
          $line=155;
          if ($opSbsetY(LexerParserRobot202310.chars(input),inputP)) {
            $line=156;
            Object ok=$fix(((gold.structures.automaton.IPushdownAutomaton)P).acceptsString($cast(java.lang.String.class,input)));
            $line=157;
            System.out.println($message(new Object[]{$opAdditY("Parser result: ",(($bool(ok))?("accepted "):("rejected ")))}));
          }
          else {
            $line=159;
            System.out.println($message(new Object[]{$opAdditY("Input contains invalid characters: ",$opDiffeY(LexerParserRobot202310.chars(input),inputP))}));
          }
        }
        $line=162;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=164;
        System.out.println($message(new Object[]{"Enter one or more lines. End with a single line with $"}));
        $line=165;
        System.out.println($message(new Object[]{"If you want to stop testing, enter EXIT"}));
        $line=166;
        string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
      }
      $line=169;
      System.out.println($message(new Object[]{"Good bye"}));
      $line=170;
      System.out.println($message(new Object[]{""}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,LexerParserRobot202310.class,"testLexerParser",$line);
    }
    return $result;
  }
}
