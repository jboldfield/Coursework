set datafile separator ','  
set xtics font "Times-Roman, 20"  
set ytics font "Times-Roman, 20"  
set key font "Times-Roman, 18"  
set xlabel "Time" font "Times-Roman, 24"  
set ylabel "Send CWND(MSS)"  font "Times-Roman, 24"  
set key outside right center  
set terminal postscript eps enhanced color font 'Times-Roman, 20'  
set output "sawtooth_32884.eps"
set yrange [0:50]

set title "10.10.1.2:32884 by Johnnie Oldfield"  
plot 'tcpprobe_32884_comma.dat' using 1:7 title 'CWND' with lines, 'tcpprobe_32884_comma.dat' using 1:8 title 'Slow Start Threshold' with lines
