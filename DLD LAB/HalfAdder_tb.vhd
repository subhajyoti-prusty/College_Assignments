----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 22.01.2024 21:36:09
-- Design Name: 
-- Module Name: HalfAdder - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity test1_tb is
end;
architecture bench of test1_tb is
  component test1
      Port ( x : in STD_LOGIC;
             y : in STD_LOGIC;
             s : out STD_LOGIC;
             c : out STD_LOGIC);
  end component;
  signal x: STD_LOGIC;
  signal y: STD_LOGIC;
  signal s: STD_LOGIC;
  signal c: STD_LOGIC;
begin
  uut: test1 port map ( x => x,
                        y => y,
                        s => s,
                        c => c );
  stimulus: process
  begin
      -- Put initialisation code here
    x <='0';
    y <='0';
    wait for 10ns;
    x <='0';
    y <='1';
    wait for 10ns;
    x <='1';
    y <='0';
    wait for 10ns;
    x <='1';  y <='1';
    wait for 10ns;
     x <='0';
     y <='0';
     wait for 10ns;
    -- Put test bench stimulus code here

    wait;
  end process;
end;

