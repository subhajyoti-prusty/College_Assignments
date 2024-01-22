----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 22.01.2024 21:04:42
-- Design Name: 
-- Module Name: Lab9_obj1_tb - Behavioral
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

entity Lab9_obj1_tb is
--  Port ( );
end Lab9_obj1_tb;

architecture Behavioral of Lab9_obj1_tb is
component Lab9_obj1
port (a, b, s: in std_logic;
        y: out std_logic);
        end component;
        signal a,b,s,y:std_logic;
        begin
        uut: Lab9_obj1 port map (a=>a,b=>b,s=>s, y=>y);
        stimulus:process
begin
a<='0';b<='0'; s<='0'; wait for 10ns;
a<='0';b<='0';s<='1'; wait for 10ns;
a<='0';b<='1';s<='0'; wait for 10ns;
a<='0';b<='1';s<='1'; wait for 10ns;
a<='1';b<='0';s<='0'; wait for 10ns;
a<='1';b<='0';s<='1'; wait for 10ns;
a<='1';b<='1';s<='0'; wait for 10ns;
a<='1';b<='1';s<='1'; wait for 10ns;
end process;

end Behavioral;
